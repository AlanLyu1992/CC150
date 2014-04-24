package Chap9;
public class Cents {
    public static int cents(int n) {
        int[] sum = 0;
        int[] A = {25,10,5,1};
        find(sum, n, A, 0, 0);
        return sum[0];
    }
    private static void find(int[] sum, int rem, int[] A, int i, int j) {
        if(i == A.length-1) {
            sum[0]++;
        }else {
            int max = rem/A[i];
            find(sum, rem-A[i]*j, i+1, 0);
            if(j+ 1 < max){
                find(sum, rem, i, j+1);
            }
        }
    }
}
