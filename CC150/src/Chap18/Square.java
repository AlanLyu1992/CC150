package Chap18;
public class Square {
    public static int[] Max(int[][] grid) {
        //nullcheck;
        int N = grid.length;
        boolean[][][] row = new boolean[N][N][N];
        boolean[][][] col = new boolean[N][N][N];
        getRange(grid, row, 0);
        getRange(grid, col, 1);
        for(int k = 0; k < N; k++) {
            for(int i = 0; i <= k; i++) {
                for(int j = 0; j <= k; j++) {
                    int r = N-1-k;
                    if(row[i][j][r] && row[i][j+r][r] &&
                       col[i][j][r] && col[i+r][j][r]) {
                        int[] ijAndLen = new int[3];
                        ijAndLen[0] = i;
                        ijAndLen[0] = j;
                        ijAndLen[0] = k+1;
                   }
                }
            }
        }
        return ijAndLen;
    }
    //type = 0 is for row, =1 for column
    private static void getRange(int[][] grid, int[][][] range, int type) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k+j < N; k++) {
                    if(grid[i+k*type][j+k*(1-type)]== 1) {
                        range[i][j][k] = true;
                    }else {
                        break;
                    }
                }
            }
        }
    }
}


        
