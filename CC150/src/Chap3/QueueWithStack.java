package Chap3;
import java.util.NoSuchElementException;
public class QueueWithStack<E> {
    final Stack<E> stack1;
    final Stack<E> stack2;
    public QueueWithStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void offer(E data) {
        addAllTo(stack1, stack2);
        stack2.push(data);
        addAllTo(stack2, stack1);
    }
    public E poll() {
        return stack1.pop();
    }
    private void addAllTo(Stack<E> stack1, Stack<E> stack2) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
    class Stack<E> {
        private Node<E> head;
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
        public boolean isEmpty() {
            return head == null;
        }
    }
    class Node<E> {
        E data;
        Node<E> next;
        Node(E x) {
            if(x == null) {
                throw new NullPointerException();
            }
            data = x;
        }
    }
}
