package Chap19;
import java.util.Arrays;
public class SuffixArray {
    String s;
    int len;
    int lenC;
    int[] sa;
    int[] rank;
    int[] height;
    public SuffixArray(String str) {
        s = str;
        len = s.length();
        lenC = Math.max(127, len);
        getSaAndRank();
        getHeight();
    }
    private void getSaAndRank() {
        int[] C = new int[lenC];
        int[] rank = new int[len];
        int[] newRank = new int[len];
        int[] sa = new int[len];
        int[] newSa = new int[len];
        for(int i = 0; i < len; i++) rank[i] = s.charAt(i)-'\0';
        for(int i = 0; i < len; i++) newSa[i] = i;
        sort(newSa, sa, rank, C); 
        for(int k = 1; k < len; k *= 2) {
            for(int i = 0; i < k; i++) newSa[i] = len-k+i;
            for(int i = 0, j = k; i < len; i++) if(sa[i]>=k) newSa[j++]=sa[i]-k;
            sort(newSa, sa, rank, C);
            newRank[sa[0]] = 0;
            for(int i = 1, j = 0; i < len; i++) 
                newRank[sa[i]] = cmp(rank, sa[i-1], sa[i], k)? j : ++j;
            int[] temp = newRank; newRank = rank; rank = temp;
        }
        this.rank = rank;
        this.sa = sa;
    }
    private void sort(int[] src, int[] dest, int[] rank, int[] C) {
        Arrays.fill(C, 0);
        for(int i = 0; i < len; i++) C[rank[src[i]]]++;
        for(int i = 1; i < lenC; i++) C[i] += C[i-1];
        for(int i = len-1; i >= 0; i--) dest[--C[rank[src[i]]]] = src[i];
    }
    private boolean cmp(int[] rank, int i, int j, int k) {
        return rank[i] == rank[j] && (i+k >= len && j+k >= len ||
               i+k < len && j+k < len && rank[i+k]== rank[j+k]);
    }
    private void getHeight() {
        int[] height = new int[len];
        for(int i = 0, k = 0; i < len; height[rank[i++]] = k) {
            if(k > 0) k--;
            if(rank[i] > 0){
                int j = sa[rank[i]-1];
                while(i+k<len && j+k<len && s.charAt(i+k)==s.charAt(j+k)) k++;
            }
        }
        this.height = height;
    }
    
}
    /*
    public static void Doubling(String s, int[] sa, int[] rank) {
        int len = s.length(), lenC = Math.max(s.length(), 26);
        int[] tempRank = new int[len];
        int[] newSa = new int[len];
        int[] C = new int[lenC];
        int[] newRank = new int[len];
        int[] temp;
        for(int i = 0; i < len; i++) rank[i] = s.charAt(i)-'a';
        for(int i = 0; i < lenC; i++) C[i] = 0;
        for(int i = 0; i < len; i++) C[tempRank[i] = rank[i]]++;
        for(int i = 1; i < lenC; i++) C[i] += C[i-1];
        for(int i = len-1; i >= 0; i--) sa[--C[tempRank[i]]] = i;
        for(int k = 1, j = 1; j < len; k*=2, lenC = j) {
            j = 0; for(int i = len-k; i < len; i++) newSa[j++] = i;//crazy?
            for(int i = 0; i < len; i++) if(sa[i] >= k) newSa[j++] = sa[i]-k; 
            for(int i = 0; i < len; i++) newRank[i] = tempRank[newSa[i]];
            for(int i = 0; i < lenC; i++) C[i] = 0;
            for(int i = 0; i < len; i++) C[newRank[i]]++;
            for(int i = 1; i < lenC; i++) C[i] += C[i-1];
            for(int i = len-1; i >= 0; i--) sa[--C[newRank[i]]] = newSa[i];
            temp = tempRank; tempRank = newSa; newSa = temp;
            j = 1; tempRank[sa[0]] = 0; 
            for(int i = 1; i < len; i++)
               tempRank[sa[i]] = cmp(newSa, sa[i-1], sa[i], k)? j-1: j++;
        }
        for(int n : rank) {
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n : sa) {
            System.out.print(n+" ");
        }
    }
    */
    
/*
    public static void Doubling(String s, int[] sa, int[] rank) {
        int len = s.length(), lenC = Math.max(s.length(), 26);
        int[] C = new int[lenC]; int[] newSa = new int[len];
        int[] newRank = new int[len]; int[] temp;
        for(int i = 0; i < len; i++) rank[i] = s.charAt(i)-'a';
        for(int k = 1; k < len; k*=2) {
            //least significant
            for(int i = 0; i < lenC; i++) C[i] = 0;
            for(int i = 0; i < len-k; i++) C[rank[i+k]]++;
            for(int i = 1; i < lenC; i++) C[i] += C[i-1];
            for(int i = len-k-1; i >= 0; i--) newSa[k-1+C[rank[i+k]]--] = i;
            for(int i = 0; i < k; i++) newSa[i] = len-k+i;
            //most significant
            for(int i = 0; i < lenC; i++) C[i] = 0;
            for(int i = 0; i < len; i++) C[rank[newSa[i]]]++;
            for(int i = 1; i < lenC; i++) C[i] += C[i-1];
            for(int i = len-1; i >= 0; i--) sa[-1+C[rank[newSa[i]]]--] = newSa[i];
            int j = 0;
            for(int i = 0; i < len-1; i++) {
                newRank[sa[i]] = j;
                if(cmp(rank, k, sa[i], sa[i+1]) < 0) {
                    j++;
                }
            }
            newRank[sa[len-1]] = j;
            temp = rank; rank = newRank; newRank = temp;
        }
        for(int n : rank) {
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n : sa) {
            System.out.print(n+" ");
        }
    }
    private static int cmp(int[] rank, int k, int i, int j) {
        int len = rank.length;
        if(rank[i] < rank[j] || i+k >= len && j+k < len ||
           i+k < len && j+k < len && rank[i+k] < rank[j+k]) {
            return -1;
        }
        return 0;
    }
    */
    /*
    public static void Doubling(String s, int[] sa, int[] rank) {
        int len = s.length();
        int lenC = Math.max(s.length(), 26);
        int[] C = new int[lenC];
        int[] newSa = new int[len];
        int[] newRank = new int[len];
        int[] temp;
        boolean flag;
        for(int i = 0; i < len; i++) {
            rank[i] = s.charAt(i)-'a';
        }
        for(int k = 1; k < len; k*=2) {
            //least significant
            for(int i = 0; i < lenC; i++) {
                C[i] = 0;
            }
            for(int i = 0; i < len-k; i++) {
                C[rank[i+k]]++;
            }
            for(int i = 1; i < lenC; i++) {
                C[i] += C[i-1];
            }
            for(int i = len-k-1; i >= 0; i--) {
                sa[k+C[rank[i+k]]-1] = i;
                C[rank[i+k]]--;
            }
            for(int i = 0; i < k; i++) {
                sa[i] = len-k+i;
            }
            for(int i = 0; i < k; i++) {
                newRank[sa[i]] = 0;
            }
            //most significant
            for(int i = 0; i < lenC; i++) {
                C[i] = 0;
            }
            for(int i = 0; i < len; i++) {
                C[rank[sa[i]]]++;
            }
            for(int i = 1; i < lenC; i++) {
                C[i] += C[i-1];
            }
            for(int i = len-1; i >= 0; i--) {
                newSa[C[rank[sa[i]]]-1] = sa[i];
                C[rank[sa[i]]]--;
            }
            int j = 0;
            for(int i = 0; i < len-1; i++) {
                newRank[newSa[i]] = j;
                if(cmp(rank, k, newSa[i], newSa[i+1]) < 0) {
                    j++;
                }
            }
            newRank[newSa[len-1]] = j;
            temp = rank;
            rank = newRank;
            newRank = temp;
        }
        for(int i = 0; i < len; i++) {
            sa[rank[i]] = i;
        }
    }
    */





