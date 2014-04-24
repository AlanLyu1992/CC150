package Chap18;
public class Heap {
    int[] A;
    int heapSize;
    int type;// >= 0 maxheap, <0 minheap
    Heap(int type) {
        this.type = type;
        A = new int[16];
        heapSize = 0;
    }
    public void add(int n) {
        heapSize++;
        if(heapSize == A.length) {
            A = Arrays.copyOf(A, A.length*2);
        }
        A[heapSize] = (1<<31);
        set(heapSize, n, type);
    }
    public void set(int idx, int val, int type) {
        int typeFactor = (type >>> 31)*(-2)+1;//>=0 -> 1, <0 -> -1;
        if(idx < 0 || idx > heapSize-1 || (A[idx]-val) * typeFactor > 0) {
            throw new IllegalArgumentException();
        }
        for(int i = idx; i > 0; i/=2) {
            int j = i/2;
            if((A[i]-A[j]) * typeFactor > 0) {
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
    }
}

