package Chap11;
public class SearchWithPivot {
    public class int find(int[] A, int x) {
        //argcheck;
        int len = A.length;
        int q = pivot(A, 0, len-1);
        int i = bSearch(A, q, len-1);
        if(i >= -q-1) {
            return i;
        }
        int j =  bSearch(A, 0, q-1, x);
        if(j > -q-1) {
            return j;
        }else {
            return len;
        }
    }
    private static int pivot(int[] A, int p, int r) {
        int s = p+1;
        while( s <= r) {
            int q = (s+r)>>>1;
            if(A[q] > A[p]) {
                s = q+1;
            }else if(A[q] > A[q-1]) {
                r = q-1;
            }else {
                return q;
            }
        }
        return p;
    }
    private static int bSearch(int[] A, int p, int r, int x) {
        while(p <= r) {
            q = (p+r)/2;
            if(A[q] < x) {
                p = q+1;
            }else if(A[q] > x) {
                r = q-1;
            }else {
                return q;
            }
        }
        return -p-1;
    }
}

