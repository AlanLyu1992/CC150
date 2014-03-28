package Chap3;
import java.util.Comparator;

public class StackWithMin<E> {
    private Node<E> head;
    private Node<E> min;
    private int size;
    private final Comparator<? super E> comparator;
    public StackWithMin(Comparator<? super E> c) {
        comparator = c;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void push(E data) {
        Node<E> newHead = new Node<>(data);
        if(size == 0 || comparator.compare(data, min.data) <= 0)  {
            Node<E> newMin = new Node<>(data);
            newMin.next = min;
            min = newMin;
        }
        newHead.next = head;
        head = newHead;
        size++;
    }
    public E pop() {
        E result = head.data;
        if(comparator.compare(result, min.data) == 0) {
            min = min.next;
        }
        head = head.next;
        size--;
        return result;
    }
    public E min() {
        return min.data;
    }
    public E peek() {
        return isEmpty()? null:head.data;
    }
    class Node<E> {
        E data;
        Node<E> next;
        Node(E data) {
            this.data = data;
        }
    }
}
