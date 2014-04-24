package Chap11;
import java.util.*;
public class Stream {
    AVLTree<Integer> stream;
    Stream() {
        stream = new AVLTree<>();
    }
    void tract(Integer x) {
        stream.add(x);
    }
    int findNumRank(Integer x) {
        return stream.findRank(x);
    }
}
class AVLTree<E extends Comparable<? super E>> {
    class Node<E> {
        E data;
        int duplicate;
        int height;
        List<Integer> subNum;
        List<Node<E>> subtrees;
        Node() {
            duplicate = 1;
            subNum = new ArrayList<>();
            for(int i = 0; i < 2; i++) {
                subNum.add(0);
            }
            subtrees = new ArrayList<>();
            for(int i = 0; i < 2; i++) {
                subtrees.add(null);
            }
        }
        Node(E data) {
            this();
            this.data = data;
        }
    }

    Node<E> root;
    int size;

    AVLTree() {
    }

    boolean add(E data) {
        size++;
        return (root = insert(root, data)) == null;
    }
    boolean delete(E data) {
        size--;
        return (root = remove(root, data)) == null;
    }
    int size() {
        return size;
    }
    int findRank(E data) {
        int rank = 0;
        Node<E> node = root;
        while(true) {
            if(node == null) {
                return -1;
            }
            int cmp = data.compareTo(node.data);
            if(cmp == 0) {
                return rank + node.subNum.get(0) + node.duplicate-1;
            }else if(cmp < 0){
                node = node.subtrees.get(0);
            }else {
                rank += node.duplicate + node.subNum.get(0);
                node = node.subtrees.get(1);
            }
        }
    }
    Node<E> insert(Node<E> node, E data) {
        if(node == null) {
            return new Node<>(data);
        }
        //idx == 0 means cmp == -1, which means insert left, same for right
        //1 - idx means another subtree
        int cmp = data.compareTo(node.data);
        int idx = (cmp+1)/2;
        if(cmp == 0) {
            node.duplicate++;
        }else {
            node.subNum.set(idx, node.subNum.get(idx)+1);
            node.subtrees.set(idx, insert(node.subtrees.get(idx), data));
            node = balance(node, data, idx);
        }
        return node;
    }
    Node<E> balance(Node<E> node, E data, int idx) {
        Node<E> left = node.subtrees.get(idx);
        Node<E> right= node.subtrees.get(1-idx);
        if(height(left)-height(right)==2) {
            if(data.compareTo(left.data)*(idx*2-1) < 0) {
                node.subtrees.set(idx, rotate(left, 1-idx));
            }
            node = rotate(node, idx);
        }
        node.height = 1 + Math.max(height(node.subtrees.get(idx)),
                                   height(node.subtrees.get(1-idx)));
        return node;
    }
    Node<E> rotate(Node<E> node, int idx) {
        Node<E> temp = node.subtrees.get(idx);
        node.subtrees.set(idx, temp.subtrees.get(1-idx));
        temp.subtrees.set(1-idx, node);
        node.height = 1 + Math.max(height(node.subtrees.get(idx)),
                                   height(node.subtrees.get(1-idx)));
        temp.height = 1 + Math.max(height(temp.subtrees.get(idx)),
                                   height(temp.subtrees.get(1-idx)));
        node.subNum.set(idx, temp.subNum.get(1-idx));
        temp.subNum.set(1-idx, node.subNum.stream().mapToInt((x)->x).sum()+node.duplicate);
        return temp;
    }
    int height(Node<E> node) {
        return node == null? -1 : node.height;
    }
    Node<E> remove(Node<E> node, E data) {
        if(node == null) {
            return null;
        }
        int cmp = data.compareTo(node.data);
        int idx = (cmp+1)/2;
        if(cmp != 0) {
            node.subNum.set(idx, node.subNum.get(idx)-1);
            node.subtrees.set(idx, remove(node.subtrees.get(idx), data));
            node = balance(node, data, 1-idx);
        }else if(node.duplicate > 1){
            node.duplicate--;
        }else if(node.subtrees.get(0) != null &&  node.subtrees.get(1) != null) {
            Node<E> temp = node.subtrees.get(0);
            while(temp.subtrees.get(1) != null) {
                temp = temp.subtrees.get(1);
            }
            node.data = temp.data;
            node.duplicate = temp.duplicate;
            node.subtrees.set(0, remove(node.subtrees.get(0), node.data));
            node = balance(node, data, 1);
        }else {
            node = node.subtrees.get(0) == null?
                   node.subtrees.get(1) : node.subtrees.get(0);
        }
        return node;
    }
}




        
        



        

    




