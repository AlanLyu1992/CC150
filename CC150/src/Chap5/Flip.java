package Chap5;
public class Flip {
    public static int flip(int m, int n) {
        /* check if 0th bit is equal, then shift right, repeat*/
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if((m & 1) != (n & 1)) {
                count++;
            }
            m = m >>> 1;
            n = n >>> 1;
        }
        return count;
    }
}
