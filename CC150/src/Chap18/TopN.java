package Chap18;
import java.util.Arrays;
public class TopN {
    public static void main(String[] args) {
        int total = 10000000;
        int N = 100000;
        
        //int[] A = {8,8,2,7,9,7,0,1,3,9};
        
        int[] A = new int[total];
        for(int i = 0; i < total; i++) {
            A[i] = (int)(Math.random()*total);
        }
        
        int[] B = Arrays.copyOfRange(A, 0, total);
        Arrays.sort(B);
        int[] D = Arrays.copyOfRange(B, 0, N);

        int topN = topN(A, 0, A.length-1, N);
        int[] C = Arrays.copyOfRange(A, 0, N);
        Arrays.sort(C);

        System.out.println(Arrays.equals(C,D));
    }
    private static int topN(int[] A, int low, int high, int r) {
        int len = high-low+1;
        if(len < 5) {
            insertSort(A, low, high);
            return A[low+r-1];
        }

        //divide A into chunks of size 5, and use insertSort to get each median
        //then recursively call topN to select the median of medians
        int chunkNum = (int)Math.ceil(len / 5.0);
        int[] aux = new int[chunkNum];
        for(int i = 0; i < chunkNum-1; i++) {
            int off = low+i*5;
            insertSort(A, off, off+4);
            aux[i] = A[off+2];
        }
        int lastOff = low+(chunkNum-1)*5;
        insertSort(A, lastOff, high);
        aux[chunkNum-1] = A[(lastOff+high)>>>1];
        int median = topN(aux, 0, chunkNum-1, (chunkNum-1)/2+1);

        //median as pivot v, partition A into v *<v * >v * v
        int a = low, b = a, c = high, d = c;
        while(true) {
            while(b <= c && A[b] <= median) {
                if(A[b] == median) {
                    swap(A, a++, b);
                }
                b++;
            }
            while(b <= c && A[c] >= median) {
                if(A[c] == median) {
                    swap(A, c, d--);
                }
                c--;
            }
            if(b > c) {
                break;
            }
            swap(A, b++, c--);
        }
        //swap A into <v * v * >v
        int lenLow = Math.min(a-low, b-a);
        vecSwap(A, low, b-lenLow, lenLow);
        int lenHigh = Math.min(high-d, d-c);
        vecSwap(A, c+1, high-lenHigh+1, lenHigh);

        //if rank is within the =v part, return v, else recursively call
        //topN to get rank
        int absR = low+r-1;
        int eLow = low+b-a;
        int eHigh= high-(d-c);
        if(absR >= eLow && absR <= eHigh) {
            return A[absR];
        }else if(absR < eLow) {
            return topN(A, low, eLow-1, r);
        }else {
            return topN(A, eHigh+1, high, absR-eHigh);
        }
    }
    private static void insertSort(int[] A, int low, int high) {
        for(int i = low; i <= high; i++) {
            for(int j = i; j > low && A[j] < A[j-1]; j--) {
                swap(A, j, j-1);
            }
        }
    }
    private static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    private static void vecSwap(int[] A, int a, int b, int len) {
        for(int i = 0; i < len; i++, a++, b++) {
            swap(A, a, b);
        }
    }
}

            

         





                
        

