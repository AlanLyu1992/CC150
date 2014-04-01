package Chap7;
import java.util.*;
public class KthPrime357 {
    public static int find(int k) {
        int[] prime = new int[k+1];
        prime[0] = 1;
        Queue<Integer> q3 = new ArrayDeque<>();
        Queue<Integer> q5 = new ArrayDeque<>();
        Queue<Integer> q7 = new ArrayDeque<>();
        q3.offer(3);
        q5.offer(5);
        q7.offer(7);
        for(int i = 1; i < k+1; i++) {
            int a3 = q3.poll();
            int a5 = q5.poll();
            int a7 = q7.poll();
            int min = min(a3, a5, a7);
            prime[i] = min;
            if(min == a3) {
                q3.offer(3*min);
                q5.offer(5*min);
                q7.offer(7*min);
            }else if(min == a5) {
                q5.offer(5*min);
                q7.offer(7*min);
            }else {
                q7.offer(7*min);
            }
        }
        return prime[k];
    }
    private static int min(int a, int b, int c) {
        if(a < b) {
            return c < a? c : a;
        }else {
            return c < b? c : b;
        }
    }
}


