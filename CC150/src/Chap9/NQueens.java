package Chap9;
public class NQueens {
    public static void nqueens(int n) {
        int[][] chess = new int[n][n];
        find(chess, 0, 0);
    }
    private static void find(int[][] chess, int i, int j) {
        if(chess[i][j] != -1) {
            if(j== n-1) {
                chess[i][j] = 1;
                print(chess);
            }else {
                find(newChess(chess, i, j), 0, j+1);
            }
        }
        if(i+1 < n) {
            find(chess, i+1, j);
        }
    }
    private static int[][] newChess(int[][] chess, int i, int j) {
        int n = chess.length;
        int[][] newChess = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i = x || j = y || i+j = x+y || i-j-x-y) {
                    newChess[i][j] = -1;
                }else {
                    newChess[i][j] = chess[i][j];
                }
            }
        }
    }
    private static void print(int[][] chess) {
        for(int[] row: chess) {
            for(int n : row) {
                if(n == 1) {
                    System.out.print('Q');
                }else {
                    System.out.print('.');
                }
            }
            System.out.print('\n');
        }
    }
}
