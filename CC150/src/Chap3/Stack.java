package Chap3;
import java.util.NoSuchElementException;
public class Stack<E> {
    Node<E> head;
    public void push(E data) {
        if(data == null) {
            throw new NullPointerException();
        }
        Node<E> newHead = new Node<>(data);
        newHead.next = head;
        head = newHead;
    }
    public E pop() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        E data = head.data;
        head = head.next;
        return data;
    }
    public E peek() {
        if(isEmpty()) {
            return null ;
        }
        return head.data;
    }
    public boolean isEmpty() {
        return head == null;
    }
    class Node<E> {
        E data;
        Node<E> next;
        Node(E data) {
            this.data = data;
        }
    }
}

