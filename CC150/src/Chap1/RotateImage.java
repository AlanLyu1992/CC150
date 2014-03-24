public class RotateImage {
    public static void main(String[] args) {
        int[][][] matrices = {{{1,1,0,1},
                             {0,0,1,1},
                             {0,1,0,1},
                             {0,1,1,1}},
                            {{1,1,0},
                             {0,0,1},
                             {0,1,0}},
                             {}};
        for(int[][] matrix : matrices) {
            printMat(matrix);
            rotateImage(matrix);
            printMat(matrix);
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
    static void rotateImage(int[][] mat) {
        if(mat == null) return;
        int n = mat.length;
        for(int i = 0; i < n/2 ; i++) {
            for(int j = i; j < n-1-i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n-1-j][i];
                mat[n-1-j][i] = mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j] = mat[j][n-1-i];
                mat[j][n-1-i] =temp;
            }
        }
    }
}




