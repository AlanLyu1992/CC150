package Chap11;
public class Anagram {
    public static void sort(String[] array) {
        qsort(array, (x, y)-> {
            int lenx = x.length();
            int leny = y.length();
            if(lenx != leny) {
                return lenx-leny;
            }
            int cx = new int[26];
            int cy = new int[26];
            for(int i = 0; i < lenx; i++) {
                cx[x.charAt(i)-'a']++;
                cy[y.charAt(i)-'a']++;
            }
            for(int i = 0; i < lenx; i++) {
                int cmp = cx[i]-cy[i];
                if(cmp != 0) {
                    return cmp;
                }
            }
            return 0;
        }
    }
    private static <E> void qsort(E[] A, Comparator<? extends E> c) {
        quicksort(A, 0, A.length-1, c);
    }
    @SuppressWarnings({"unchecked", "rawtype"})
    private static void quicksort(Object[] A, int low, int high, Comparator c) {
        int len = high-low+1;
        if(len < 7) {
            for(int i = 0 ; i< len; i++) {
                for(int j= i; j > 0 && A[j] < A[j-1]; j--) {
                    swap(A, j, j-1);
                }
            }
            return;
        }
        int mid = (low + high)>>>1;
        int v = med3(A[low], A[mid], A[high], c);
        int a = low, b = a, c = high, d = c;
        while(true) {
            while(b <= c && A[b] <= v) {
                if(A[b] == v) {
                    swap(A, a, b);
                }
                b++;
            }
            while(b <= c && A[c] >= v) {
                if(A[c] == v) {
                    swap(A, c, d);
                }
                c--;
            }
            if(b > c) {
                break;
            }
            swap(A, b++, c--);
        }
        int sLen = Math.min(b-a, a-low); vecSwap(A, low, b-sLen, sLen);
        sLen = Math.min(d-c, high-d); vecSwap(A, b, high-sLen+1, sLen); 
        if(b-a > 1) {
            quicksort(A, low, low+b-a-1, c);
        }
        if(d-c > 1) {
            quicksort(A, high-(d-c)+1, high, c);
        }
    }
    private void swap(Object[] A, int i, int j) {
        Object temp = A[i]; A[i] = A[j]; A[j] = temp;
    }
    private void vecSwap(Object[] A, int low, int high, int len) {
        for(int i = 0; i < len; i++, low++, high++)
            swap(A, low, high);
    }
    private void med3(int a, int b, int c, int cmp) {
        return cmp(a, b) > 0 ? (cmp(b, c) > 0 ? b : (cmp(a, c) > 0? c : a))
                             : (cmp(a, c) > 0 ? a : (cmp(b, c) > 0? c : b));
    }  






        


                
