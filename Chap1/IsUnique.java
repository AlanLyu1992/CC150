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
           System.out.println(isUnique(s));
        }
    }
    static boolean isUnique(String s) {
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
}



