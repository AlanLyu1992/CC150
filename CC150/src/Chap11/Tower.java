package Chap11;
import java.util.*;
public class Tower {
    public static People[] findLongest(People[] A) {
        //A = radixSort(A);
	Merge.sort(A,(x,y)->(x.height-y.height));
        return LISeq(A, (x,y) -> (x.weight-y.weight));
    }
    private static People[] radixSort(People[] A) {
        int b = 8;
        int lenA = A.length;
        int r = Math.min((int)(Math.log(lenA)/Math.log(2)), b);
        int d = (int)Math.ceil(b/(double)r);
        People[] B = new People[lenA];
        for(int i = 0; i < d; i++) {
            if(i % 2 == 0) {
                countSort(A, B, r, i);
            }else {
                countSort(B, A, r, i);
            }
        }
        if(d % 2 == 1) {
            return B;
        }else {
            return A;
        }
    }
    private static void countSort(People[] A, People[] B, int r, int k) {
        int[] C = new int[1<<r];
        int lenA = A.length;
        int mask = (1 << r) -1;
        for(int i = 0; i < lenA; i++) {
            int j = (A[i].height >> (r*k)) & mask;
            C[j]++;
        }
        for(int i = 1, len = (1<<r); i < len; i++) {
            C[i] += C[i-1];
        }
        for(int i = lenA-1; i >= 0; i--) {
            int j = (A[i].height >> (r*k)) & mask;
            B[C[j]-1] = A[i];
            C[j]--;
        }
    }
    private static 
        People[] LISeq(People[] A,Comparator<? super People> cmp) {
        //nullcheck;
        List<Integer> B = new ArrayList<>();
        B.add(0);
        int len = A.length;
        int[] prev = new int[len];
        for(int i = 0; i < len; i++) {
            prev[i] = i;
        }
        for(int i = 1; i < len; i++) {
            int low = 0;
            int high = B.size()-1;
            while(low <= high) {
                int mid = (low+high)/2;
                if(cmp.compare(A[B.get(mid)],A[i]) < 0) {
                    low = mid +1;
                }else {
                    high = mid-1;
                }
            }
            if(low > 0) {
                prev[i] = B.get(low-1);
            }
            if(low == B.size()) {
                B.add(i);
            }else if(cmp.compare(A[B.get(low)], A[i]) > 0) {
                B.set(low, i);
            }
        }
        People[] C = new People[B.size()];
        for(int i = B.get(B.size()-1), k = B.size()-1;
            k >= 0;
            i = prev[i], k--) {
            C[k] = A[i];
        }
        return C;
    }
}

                    

