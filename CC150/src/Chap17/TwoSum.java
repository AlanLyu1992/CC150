package Chap17;
import java.util.*;
public class TwoSum {
    public class List<Pair> TwoSum(int[] A, int sum) {
        //nullcheck;
        Map<Integer, Integer> map = new HashMap<>();
        List<Pair> pairs = new ArrayList<>();
        int len = A.length;
        for(int i = 0; i < len; i++) {
            Integer diff = map.get(sum-A[i]);
            if(diff != null) {
                diff--;
                if(diff == 0) {
                    map.remove(sum-A[i]);
                }
                pairs.add(new Pair(sum-A[i], A[i]);
            }
        }
        return pairs;
    }
}
class Pair {
    int a;
    int b;
    Pair(int x, int y) {
        a = x;
        b = y;
    }
    public void print() {
        System.out.println(a+"+"+b+"="+(a+b));
    }
}

