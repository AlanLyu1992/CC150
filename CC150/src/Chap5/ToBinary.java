package Chap5;
public class ToBinary {
    public static void printBinary(Double n) {
        byte[] rep = new byte[32];
        if(n < 0 || n > 1) {
            throw new IllegalArgumentException();
        }
        int i;
        for(i = 0; i < 32; i++) {
            if(n > 0.5) {
                n = 2*n-1;
                rep[i] = 1;
            }else if(n < 0.5) {
                n = 2*n;
                rep[i] = 0;
            }else {
                rep[i] = 1;
                break;
            }
        }
        if(i == 32) {
            System.out.println("ERROR");
        }else {
            System.out.print("0.");
            for(byte x : rep) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
