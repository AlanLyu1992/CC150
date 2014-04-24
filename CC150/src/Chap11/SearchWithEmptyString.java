package Chap11;
public class SearchWithEmptyString {
    public static int search(String[] A, String s) {
        return search(s, A, 0, A.length-1);
    }
    private static int search(String s, String[] A, int start, int end) {
        while(start <= end) {
            int mid = (start+end)>>>1;
            if(A[mid].equals(s)) {
                return mid;
            }else {
                int j = goLeft(mid-1, A);
                if(j < 0 || A[j].compareTo(x) < 0) {
                    start = mid+1;
                }else if(A[j].compareTo(x) >0) {
                    end = j-1;
                }else {
                    return j;
                }
            }
        }
        return -1;
    }
    private static int goLeft(int i, String[] A) {
        while(i >= 0) {
            if(!A[i].equals("")) {
                return i;
            }
            i--;
        }
        return i;
    }
}
