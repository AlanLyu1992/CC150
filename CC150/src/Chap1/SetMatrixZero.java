package Chap1;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][][] matrices = {{{1,1,1,1},
                               {1,1,0,1},
                               {1,1,1,1},
                               {1,1,1,1}},
                              {{1,1,1},
                               {1,0,1},
                               {1,1,0}},
                               {}};
        for(int[][] matrix : matrices) {
            printMat(matrix);
            setMatrixZero(matrix);
            printMat(matrix);
        }
    }
    static void setMatrixZero(int[][] mat) {
        if(mat == null) return;
        int M = mat.length;
        if(M == 0) return;
        int N = mat[0].length;
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(mat[i][j] == 0) {
                    paint(mat, i, j);
                    j++;
                    while(j < N && mat[i][j] != 0) {
                        mat[i][j] = 0;
                        j++;
                    }
                    j--;
                }else if(mat[i][j] == 0x7AC0BE11) {
                    mat[i][j] = 0;
                }
            }
        }
    }
    static void paint(int[][] mat, int i, int j) {
        int M = mat.length;
        int x = i;
        x = i-1;
        while(x >= 0) {
            mat[x][j] = 0;
            x--;
        }
        x = i+1;
        while(x < M && mat[x][j] != 0) {
            mat[x][j] = 0x7AC0BE11;
            x++;
        }
        j--;
        while(j >= 0) {
            mat[i][j] = 0;
            j--;
        }
    }
    static void printMat(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
                    


