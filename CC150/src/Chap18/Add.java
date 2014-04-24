package Chap18;
public class Add {
    public static int add(int a, int b) {
        int carry = 0;
        int c = 0;
        for(int i = 0; i < 31; i++) {
            inf fa = a & 1;
            int fb = b & 1;
            if(fa == 0 && fb == 0) {
                c |= (carry << i);
                carry = 0;
            }else if(fa == 0 && fb == 1 || fb ==0 && fa == 1) {
                c |= (1<<i);
            }else if(fa == 1 && fb == 1) {
                c |= (carry << i);
                carry = 1;
            }
            a >>= 1;
            b >>= 1;
        }
        return c;
    }
}

