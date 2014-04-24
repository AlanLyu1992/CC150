package Chap17;
public class Zero {
    public static int zero(int m){
        int nFacOf2;
        int nFacOf5;
        int n = m;
        while(n % 2 == 0){
            n /= 2;
            nFacOf2++;
        }
        n = m;
        while(n % 5 == 0) {
            n /= 5;
            nFacOf5++;
        }
        return Math.min(nFacOf2, nFacOf5);
    }
}
