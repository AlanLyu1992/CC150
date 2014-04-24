package Chap18;
import java.util.*;
public class MaxHeap {
    private int[] heap;
    private int heapSize;
    MaxHeap(int len) {
        heapSize = len;
        heap = new int[len];
        Arrays.fill(heap, (1<<31)-1);
    }
    public void push(int n) {
        if(n < heap[0]) {
            heap[0] = n;
            maxHeapify(0);
        }
    }
    public int[] toArray() {
        return heap;
    }
    private void maxHeapify(int i) {
        int j = max(i, 2*i, 2*i+1);
        if(i != j){
            swap(i, j);
            maxHeapify(j);
        }
    }
    private void max(int a, int b, int c) {
        if(c < heapSize) {
            return heap[a] > heap[b] ? (heap[a] > heap[c] ? a : c) :
                                       (heap[b] > heap[c] ? b : c);
        }else if(b < heapSize) {
            return heap[a] > heap[b] ? a : b;
        }else {
            return a;
        }
    }
    private final void swap(int i, int j) {
        int temp = heap[i]; heap[i] = heap[j]; heap[j] = temp;
    }
}
    






    

        
