package Chap18;
public class NumOf2 {
    public static int numOf2(int n) {
        int count = 0;
        for(int i = 0; i < 9; i++) {
            int pow1 = (int)Math.pow(10, i+1);
            pow2 = pow1/10;
            int q = n/pow1;
            int r = (n % pow1)/pow2;
            count += q * pow2;
            if(r > 2){
                count += pow2;
            }else if(r ==2) {
                count += r-2*pow2+1;
            }
        }
        int pow2 = (int)Math.pow(10,9);
        int r = n/ pow2;
        if(r == 2) {
            count +=r-2*pow2+1;
        }
    }
}
