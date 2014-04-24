package Chap17;
public class Swap {
    public static void swap(int[] a, int[] b) {
        //nullcheck;
        a[0] = a[0]^b[0];
        b[0] = a[0]^b[0];
        a[0] = a[0]^b[0];
    }
}
