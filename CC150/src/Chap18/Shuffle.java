package Chap18;
import java.util.*;
public class Shuffle {
    public static void shuffle(int[] a) {
        List<Integer> list = new LinkedList<>(Arrays.asList(a));
        for(int i = 0; i < 52; i++) {
            int ridx = (int)Math.floor(Math.Random()*52);
            a[i] = list.remove(ridx);
        }
    }
}
