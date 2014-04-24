package Chap11;
import java.util.*;
public class TryMerge {
    public static void main(String[] args) {
        int[] A = {60,180,61,179,62,181,63,170,70,190,50,150,55,180};
        People[] input = genPeople(A);
        sort(input, (x,y)->(x.height-y.height));
    }
    private static People[] genPeople(int[] A) {
        People[] B = new People[A.length/2];
        for(int i =0; i < A.length; i+=2) {
            B[i/2] = new People(A[i],A[i+1]);
        }
        return B;
    }
    public static <T> void sort(T[] a, Comparator<? super T> c) {
        legacyMergeSort(a, c);
    }

    private static <T> void legacyMergeSort(T[] a, Comparator<? super T> c) {
        T[] aux = a.clone();
        mergeSort(aux, a, 0, a.length, 0, c);
    }
    /**
     * Src is the source array that starts at index 0
     * Dest is the (possibly larger) array destination with a possible offset
     * low is the index in dest to start sorting
     * high is the end index in dest to end sorting
     * off is the offset into src corresponding to low in dest
     * To be removed in a future release.
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    private static void mergeSort(Object[] src,
            Object[] dest,
            int low, int high, int off,
            Comparator c) {
        int length = high - low;

        // Insertion sort on smallest arrays
        if (length < 7) {
            for (int i=low; i<high; i++)
                for (int j=i; j>low && c.compare(dest[j-1], dest[j])>0; j--)
                    swap(dest, j, j-1);
            return;
        }

        // Recursively sort halves of dest into src
        int destLow  = low;
        int destHigh = high;
        low  += off;
        high += off;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, low, mid, -off, c);
        mergeSort(dest, src, mid, high, -off, c);

        // If list is already sorted, just copy from src to dest.  This is an
        // optimization that results in faster sorts for nearly ordered lists.
        if (c.compare(src[mid-1], src[mid]) <= 0) {
            System.arraycopy(src, low, dest, destLow, length);
            return;
        }

        // Merge sorted halves (now in src) into dest
        for(int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && c.compare(src[p], src[q]) <= 0)
                dest[i] = src[p++];
            else
                dest[i] = src[q++];
        }
    }
    private static void swap(Object[] x, int a, int b) {
        Object t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

}
