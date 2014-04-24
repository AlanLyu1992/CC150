package Chap11;
public class MergeArrays {
    public class void merge(int[] A, int[] B, int sizeA) {
        int lenA = A.length;
        int lenB = B.length;
        int i = lenA;
        int j = lenB;
        int k = sizeA;
        while(j >= 0) {//Bad smell here, should used technique in MergeSort?
            if(k >= 0) {
                if(A[k] > B[j]) {
                    A[i] = A[k];
                }else {
                    A[i] = B[j];
                }
            }else {
                A[i] = B[j];
            }
            i--;
        }
    }
}

