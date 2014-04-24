package Chap18;
import java.util.*;
public class Random {
    public static int[] random(int[] A, int m) {
        List<I> list = new LinkedList<>(Arrays.asList(A));
        int n = A.length;
        int[] B = new int[m];
        for(int i = 0; i < m; i++) {
            int ridx = (int)Math.floor(Math.random()*n);
            B[i] = list.remove(ridx);
        }
        return B;
    }
}
