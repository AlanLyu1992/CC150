import java.util.*;
public class RemoveDuplicate {
    public static void main(String args[]) {
        String[] set = {"abc","","aabbcc","abcabc","aaaa"};
        for(String s : set) {
           System.out.println(s);
           StringBuilder sb1, sb2;
           sb1 = (s == null? null: new StringBuilder(s));
           sb2 = (s == null? null: new StringBuilder(s));
           removeDuplicate1(sb1);
           removeDuplicate2(sb2);
           System.out.println(sb1.toString()+" "+sb2.toString());
           System.out.println(sb1.toString().equals(sb2.toString()));
        }
    }
            
    static void removeDuplicate1(StringBuilder s) {
        if(s == null) return;
        int len = s.length();
        int count = 0;
        for(int i =0; i < len; i++) {
            char c = s.charAt(i);
            int j;
            for(j = 0; j < i; j++) {
                char d = s.charAt(j);
                if(c == d) {
                    break;
                }
            }
            if(j == i) {
                s.setCharAt(count, s.charAt(j));
                count++;
            }
        }
        s.setLength(count);
    }
    static void removeDuplicate2(StringBuilder s) {
        if(s == null) return;
        BitSet bitset = new BitSet(128);
        int count = 0;
        int len = s.length();
        for(int i = 0; i < len; i++) {
            byte idx = (byte)s.charAt(i);
            if(!bitset.get(idx)) {
                bitset.set(idx);
                s.setCharAt(count, s.charAt(i));
                count++;
            }
        }
        s.setLength(count);
    }
}
