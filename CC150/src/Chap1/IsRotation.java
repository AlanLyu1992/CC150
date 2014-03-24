public class IsRotation {
    public static void main(String[] args) {
        String[] A = {"aabc","aaa","","erbottlewat","abc"};
        String[] B = {"abca","aaa","","waterbottle","cba"};
        for(int i = 0; i < A.length; i++) {
            System.out.println(isRotation(A[i],B[i]));
        }
    }
    static boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        s1 += s1;
        return isSubString(s1, s2);
    }
    static boolean isSubString(String s1, String s2) {
        if(s1 == null || s2 == null) {
            return false;
        }
        int len1 = s1.length();
        int len2 = s2.length();
        int[] next = new int[len2];
        if(len2 == 0) {
            return true;
        }
        next[0] = 0;
        int j = 0;
        for(int i = 1; i < len2; i++) {
            while(s2.charAt(i) != s2.charAt(j)) {
                if(j == 0) {
                    j = -1;
                    break;
                }
                j = next[j-1];
            }
            j++;
            next[i] = j;
        }
        j = 0;
        for(int i = 0; i < len1; i++) {
            while(s1.charAt(i) != s2.charAt(j)) {
                if(j == 0) {
                    j = -1;
                    break;
                }
                j = next[j-1];
            }
            j++;
            if(j == len2) {
                return true;
            }
        }
        return false;
    }
}
