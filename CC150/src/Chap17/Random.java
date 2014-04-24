package Chap17;
public class Random {
    public static int rand7() {
        int[] A = new int[7];
        while(true) {
            int max = -1;
            int maxI = 0;
            boolean success = false;
            for(int i = 0; i < 7; i++) {
                A[i] = rand5();
                if(A[i] = max) {
                    success = true;
                    break;
                }else if(A[i] > max) {
                    max = A[i];
                    maxI = i;
                }
            }
            if(success) {
                return maxI;
            }
        }
    }
    private static int rand5() {
        return (int)Math.floor((Math.random()*5);
    }
}

