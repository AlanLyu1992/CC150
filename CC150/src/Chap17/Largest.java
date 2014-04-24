package Chap17;
public class Largest {
    public static int max(int[][] A) {
        //argcheck;
        int sum = a[0];
        int max = a[0];
        for(int i = 1; i < len; i++) {
            if(sum < 0) {
                sum = A[i];
            }else {
                sum+=A[i];
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
