package Chap19;
import java.util.Arrays;
public class StdRMQ {
    int len;
    int lenR;
    int chunkSize;
    int chunkNum;
    int[] E;
    int[] L;
    int[] H;
    int[] T;
    int[][] M;
    int[][][] P;
    public StdRMQ(int[] A) {
        len = A.length;
        lenR = 2*len-1;
        chunkSize = (int)(Math.log(lenR)/Math.log(2)/2)+1;
        //chunkSize = (int)(Math.log(lenR)/Math.log(2)/2);
        chunkNum = (int)Math.ceil((double)lenR/chunkSize);
        getTable(A);
    }
    public int query(int i, int j) {
        i = H[i];
        j = H[j];
        if(i > j) {
            int tmp = i; i = j; j = tmp;
        }
        int qi = i / chunkSize;
        int qj = j / chunkSize;
        int ri = i % chunkSize;
        int rj = j % chunkSize;
        if(qi == qj) {
            return E[qi*chunkSize+P[T[qi]][ri][rj]];
        }else {
            int a = qi*chunkSize+P[T[qi]][ri][chunkSize-1];
            int b = queryST(qi+1, qj-1);
            int c = qj*chunkSize+P[T[qj]][0][rj];
            return b == -1? E[(L[a] <= L[c]? a : c)] :
                            E[min3(a, b, c)]; 
        }
    }

                
    private int min3(int a, int b, int c) {
        //not known whether it's necessary to keep this sort stable
        return L[a] <= L[b] ? (L[a] <= L[c] ? a : c) : (L[b] <= L[c] ? b : c);
    }
    private void getTable(int[] A) {
        getRestrictedRMQ(A);
        getBinaryExprT();
        getBinaryTableP();
        getSparseTable();
    }
    private void getRestrictedRMQ(int[] A) {
        int[] left = new int[len];
        int[] right = new int[len];
        int[] stack = new int[4*len];
        int root = CartesianTree(A, left, right, stack);
        E = new int[lenR];
        L = new int[lenR];
        H = new int[len];
        Arrays.fill(H, -1);
        eulerTour(left, right, stack, root);
    }
    private int CartesianTree(int[] A, int[] left, int[] right, int[] stack) {
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);
        stack[0] = 0;
        for(int i = 1, j = 0; i < len; i++, j++) {
            while(A[i] < A[stack[j]]) {
                j--;
                if(j < 0 || A[i] >= A[stack[j]]) {
                    left[i] = stack[j+1];
                    break;
                }
            }
            if(j >= 0) {
                right[stack[j]] = i;
            }
            stack[j+1] = i;
        }
        return stack[0];
    }
    //iterative version
    private void eulerTour(int[] left, int[] right, int[] stack, int root) {
        stack[0] = 0;
        stack[1] = root;
        int j = 1;
        int idx = -1;
        while(j >= 0) {
            idx++;
            int cur = stack[j];
            int level = stack[j-1];
            j -= 2;
            if(cur < 0) {
                cur = -cur-1;
            }else {
                if(H[cur] == -1) H[cur] = idx;
                if(right[cur] != -1) {
                    stack[++j] = level;
                    stack[++j] = -cur-1;
                    stack[++j] = level+1;
                    stack[++j] = right[cur];
                }
                if(left[cur] != -1) {
                    stack[++j] = level;
                    stack[++j] = -cur-1;
                    stack[++j] = level+1;
                    stack[++j] = left[cur];
                }
            }
            E[idx] = cur;
            L[idx] = level;
        }
    }
    private void getBinaryExprT() {
        int[] BinaryL = new int[lenR];
        for(int i = 1; i < lenR; i++) {
            BinaryL[i] = L[i]-L[i-1];
        }
        for(int i = 0; i < lenR; i++) {
            BinaryL[i] = (BinaryL[i]+1)/2;
        }
        T = new int[chunkNum];

        for(int i = 0; i < chunkNum; i++) {
            int sum = 0;
            for(int j = 0; j < chunkSize; j++) {
                if(i*chunkSize+j >= lenR || BinaryL[i*chunkSize+j] == 1) {
                    //for the overflow part of last chunk,
                    //we let it be all 1s
                    sum += (1 << (chunkSize-1-j));
                }
            }
            T[i] = sum;
        }
    }
    private void getBinaryTableP() {
        int lenP = (1 << chunkSize);
        P = new int[lenP][chunkSize][chunkSize];
        int[] binaryExp = new int[chunkSize];
        for(int i = 0; i < lenP; i++) {
            for(int j = 0; j < chunkSize; j++) {
               binaryExp[j] = i >> (chunkSize-j-1) & 1;
            }
            for(int j = 0; j < chunkSize; j++) {
                P[i][j][j] = j;
            }
            for(int j = 0; j < chunkSize; j++) {
                int min = 0;
                int sum = 0;
                for(int k = j+1; k < chunkSize; k++) {
                    if((sum += (binaryExp[k]<<1)-1) < min) {
                        min = sum;
                        P[i][j][k] = k;
                    }else {
                        P[i][j][k] = P[i][j][k-1];
                    }
                }
            }
        }
    }
    private void getSparseTable() {
        int[] B = new int[chunkNum];
        for(int i = 0; i < chunkNum; i++) {
            B[i] = i*chunkSize + P[T[i]][0][chunkSize-1];
        }
        int lenM = (int)(Math.log(chunkNum)/Math.log(2))+1;
        M = new int[chunkNum][lenM];
        for(int i = 0; i < chunkNum; i++) {
            M[i][0] = B[i];
        }
        for(int j = 1; j < lenM; j++) {
            for(int i = 0; i + (1<<j) <= chunkNum; i++) {
                int k = i + (1<<(j-1));
                M[i][j] = L[M[i][j-1]] <= L[M[k][j-1]] ? M[i][j-1] : M[k][j-1];
            }
        }
    }
    private int queryST(int i, int j) {
        if(i > j) return -1;
        int lenIJ = j-i+1;
        int n = (int)(Math.log(lenIJ)/Math.log(2));
        int k = j-(1<<n)+1; 
        return L[M[i][n]] <= L[M[k][n]] ? M[i][n] : M[k][n];
    }
}

        

    /*
    private eulerTour(int cur, int level) {//recursive version 
        idx++;
        E[idx] = cur;
        L[idx] = level;
        if(H[idx] == -1) H[idx] = i;
        if(left[cur] != -1) {
            eulerTour(left[cur], level+1);
            E[idx] = cur;
            L[idx] = level;
            if(H[idx] == -1) H[idx] = i;
        }
        if(right[cur] != -1) {
            eulerTour(right[cur], level+1);
            E[idx] = cur;
            L[idx] = level;
            if(H[idx] == -1) H[idx] = i;
        }
    }*/




