package Chap19;
public class LongestPalindrome {
    public static String isPa(String s) {
        if(s == null || s.length() == 0) return "";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reSb = (new StringBuilder(s)).reverse();
        String str = sb.append("|").append(reSb).toString();
        SuffixArray sa = new SuffixArray(str);
	for(int i = 0; i<str.length(); i++) {
		System.out.print(sa.height[i]+",");
	}
        StdRMQ lcp = new StdRMQ(sa.height);
        int len = s.length();
        int max = 0;
        int maxi = 0;
        boolean isEven = false;
        for(int i = 0; i < len; i++) {//odd length palin
            int j = sa.rank[i];
            int k = sa.rank[2*len-i];
            if(j > k) {
                int tmp = j; j = k; k = tmp;
            }
            int idx = lcp.query(j+1,k);
            int halfLen = sa.height[idx];
            if(2*halfLen-1 > max) {
                max = 2*halfLen-1;
                maxi = i;
            }
        }
        for(int i = 1; i < len; i++) {//even length palin
            int j = sa.rank[i];
            int k = sa.rank[2*len-i+1];
            if(j > k) {
                int tmp = j; j = k; k = tmp;
            }
            int idx = lcp.query(j+1,k);
            int halfLen = sa.height[idx];
            if(2*halfLen > max) {
                max = 2*halfLen;
                maxi = i;
                isEven = true;
            }
        }
        return isEven? s.substring(maxi-max/2, maxi+max/2) :
                       s.substring(maxi-max/2, maxi+max/2+1); 
    }
}

            

        


