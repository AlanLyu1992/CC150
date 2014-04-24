package Chap11;
import java.util.*;
public class Merge {
    public static <E> void sort(E[] A, Comparator<? super E> c) {
        E[] B = A.clone();
        mergeSort(B, A, 0, A.length-1, c);
    }
    private static void mergeSort(Object[] src, Object[] dest, int low,
                                      int high, Comparator c) {
        int len = high - low +1;
        if(len < 7) {
            for(int i = low; i <= high; i++) {
                for(int j = i; j > low && c.compare(dest[j], dest[j-1]) < 0; j--) {
                    Object temp = dest[j];
                    dest[j] = dest[j-1];
                    dest[j-1] = temp;
                }
            }
            return;
        }
        int mid = (low+high)>>>1;
        mergeSort(dest, src, low, mid, c);
        mergeSort(dest, src, mid+1, high, c);
        if(c.compare(src[mid], src[mid+1]) <= 0) {
            System.arraycopy(src, low, dest, low, len);
            return;
        }
        for(int i = low, p = low, q = mid+1; i <= high; i++) {
            if(q > high || p < mid+1 && c.compare(src[p], src[q]) <=0) {
                dest[i] = src[p++];
            }else {
                dest[i] = src[q++];
            }
        }
    }
}
    
    
