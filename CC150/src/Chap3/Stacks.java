package Chap3;
import java.util.Comparator;
public class Stacks {
    public static <E> void insertionSort(Stack<E> unsorted,
                                         Comparator<? super E> comp) {
        Stack<E> sorted = new Stack<>();
        while(!unsorted.isEmpty()) {
            E temp = unsorted.pop();
            while(!sorted.isEmpty() && comp.compare(temp,sorted.peek())<0) {
                unsorted.push(sorted.pop());
            }
            sorted.push(temp);
        }
        while(!sorted.isEmpty()) {
            unsorted.push(sorted.pop());
        }
    }
}
