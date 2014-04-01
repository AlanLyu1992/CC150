package Chap5;
public class Next {
    public static void next(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException();
        }
        /* find the smallest */
        /* find first 1 bit*/
        int i = 0;
        for(; i < 30; i++) {
            if((n & (1 << i)) != 0) {
                break;
            }
        }
        /*if highest 1 bit found, smallest is itself, else swap 1 with
         * next zero
         */
        if(i == 30) {
            System.out.println();
        }else {
            /* find next zero */
            int j = i + 1;
            while(((n>>j) & j) != 0) {
                j++;
            }
            /*set ith zero */
            n = n & ~(1 << i);
            /* set jth one */
            n = n | ~(1 << j);
            System.out.println(n);
        }
        /* find largest */
        /* find how many 1s */
        int count = 1;
        for(int j = i+1; j < 30; j++) {
            if(((n>>j) & 1) == 1) {
                count++;
            }
        }
        /* if n is largest sum with all 1, print itself*/
        if(count == 31) {
            System.out.println(n);
        }else {
            /* get count 1s and move leftmost*/
            n = ((1<<count)-1) << (31-count);
            System.out.println(n);
        }
    }
}
