package Chap9;
public class BoolExp {
    public static int boolExp(String s, boolean res) {
        int[] count = new int[1];
        StringBuilder rem = new StringBuilder(s);
        find(count, rem, res);
        return count;
    }
    private static void find(int[] count, StringBuilder rem, boolean res) {
        int n = (rem.length()-1)/2;
        if(n == 1) {
            char num = calc(rem);
            if(num-97 == 1) = res;
            count[0]++;
        }else {
            for(int i =0; i < n; i++) {
                char num = calc(rem.substring(2*i, 2*i+3));
                StringBuilder newNum = rem.substring(0,2*i).append(num)
                                                           .append(2i+3);
                find(count, newNum, res);
            }
        }
    }
}
