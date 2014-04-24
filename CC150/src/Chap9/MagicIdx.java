package Chap9;
public class MagicIdx {
    public static int index(int[] A) {
        return find(A, 0, A.length-1);
    }
    private static int find(int[] A, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start+end)>>>1;
        if(A[mid] == mid) {
            return mid;
        }else if(A[mid] > mid) {
            return find(A, mid+1, end);
        }else {
            return find(A, start, mid-1);
        }
    }
}
