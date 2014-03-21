public class ReplaceSpaces {
    public static void main(String[] args) {
        String[] set = {"", " ", " a", "a ", "  a", "a  b", "ab  "};
        for(String s : set) {
            StringBuilder sb = new StringBuilder(s);
            replaceSpaces(sb);
            System.out.print(sb.toString()+" ");
        }
    }
    static void replaceSpaces(StringBuilder s) {
        int len = s.length();
        int count  = 0;
        for(int i = 0; i < len; i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        int newLen = len + count *2;
        s.setLength(newLen);
        int j = len -1;
        for(int i = newLen -1; i >=0; i--) {
            if(s.charAt(j) == ' ') {
                s.setCharAt(i, '0');
                s.setCharAt(i-1, '2');
                s.setCharAt(i-2, '%');
                i -= 2;
                j--;
            }else {
                s.setCharAt(i, s.charAt(j));
                j--;
            }
        }
    }
}
