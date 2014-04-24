package Chap17;
public class TreeToDLL {
    BST tree;
    TreeToDLL(int[] A) {
        tree = new BST();
        for(int a : A) {
            tree.add(a);
        }
    }
    DLL toDLL() {
        list = new DLL();
        BiNode node = tree.root.node2;
        BiNode prev = list.head;
        while(node != null) {
            if(node.node1 == null) {
                prev.node2 = node;
                node.node1 = prev;
                prev = node;
                node = node.node2;
            }else {
                BiNode s = node.node1;
                while(s.node2 != null && s.node2 != node) {
                    s = s.node2;
                }
                if(s.node2 == null) {
                    s.node2 = node;
                    node = node.node1;
                }else {
                    s.node2 = null;
                    prev.node2 = node;
                    node.node1 = prev;
                    prev = node;
                    node = node.node2;
                }
            }
        }
        prev.node2 = list.tail;
        list.tail.node1 = prev;
        return list;
    }
}
class BiNode {
    public BiNode node1, node2;
    public int data;
    BiNode(int x) {
        data = x;
    }
}
class BST {
    BiNode root;
    public BST() {
        root = new BiNode(0);
    }
    public void add(int n) {
        BiNode node = root;
        while(node != null && node.data != n) {
            if(node.data < n) {
                if(node.node2 == null) {
                    node.node2 = new BiNode(n);
                    return;
                }else {
                    node = node.node2;
                }
            }else {
                if(node.node1 == null) {
                    node.node1 = new BiNode(n);
                    return;
                }else {
                    node = node.node1;
                }
            }
        }
        if(n > root.data) {//?????
            root.node1 = root.node2;
        }else {
            root.node2 = root.node1;
        }
    }
}
class DLL {
    BiNode head;
    BiNode tail;
    public DLL() {
        head = new BiNode(0);
        tail = new BiNode(0);
        head.node2 = tail;
        tail.node1 = head;
    }
    public print() {
        BiNode node = head.node2;
        while(node != tail) {
            Systm.out.println(node.data+" ");
            node = node.node2;
        }
    }
    public reversePrint() {
        BiNode node = tail.node1;
        while(node != head) {
            Systm.out.println(node.data+" ");
            node = node.node1;
        }
    }
}

