package Chap1;

import java.util.*;
/**
 *
 * @author yin
 */
public class IsUnique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] A = {"", "A","AA","ABCDEFGG","ABCEDFG"};
        for(String s : A) {
           System.out.println(isUnique1(s) == isUnique2(s));
        }
    }
    static boolean isUnique1(String s) {
        BitSet bitset = new BitSet(128);
        int len = s.length();
        for(int i =0; i < len; i++) {
            byte asciiCode = (byte)s.charAt(i);
            if(bitset.get(asciiCode)) {
                return false;
            }else {
                bitset.set(asciiCode);
            }
        }
        return true;
    }
    static boolean isUnique2(String s) {
        int[] bitset = new int[4];
        int len = s.length();
        for(int i = 0; i < len; i++) {
            byte idx = (byte)s.charAt(i);
            byte a = (byte)(idx/32);
            byte j = (byte)(idx % 32);
            int n = bitset[a];
            if(((n>>j) & 1) == 0) {
                bitset[a] = bitset[a] | (1 << j);
            }else {
                return false;
            }
        }
        return true;
    }
}



