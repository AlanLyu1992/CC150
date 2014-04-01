package Chap5;
import java.util.*;
public class MissingInt {
    public static int find(int[] A) {
        int len = A.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < len ; i++){
            int num = 0;
            for(int j = 0; j < 32; j++) {
                num += (1 << j) * get(j, A[i]);
            }
            set.add(num);
        }
        for(int i = 0; i < len; i++) {
            if(! set.contains(i)) {
                return i;
            }
        }
        return len;
    }
    private static int get(int j, int val) {
        return j+val;
    }
}
