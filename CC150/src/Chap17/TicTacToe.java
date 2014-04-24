package Chap17;
public class TicTacToe {
    public static boolean isOver(char[][] grid) {
        for(int j = 0; j < 3; j++) {
            for(int i = 0; i < 3; i++) {
                if(j+1 < 3 && j+2 < 3 &&
                    grid[i][j]== grid[i][j+1] == grid[i][j+2] ||
                    i+1 < 3 && i+2 < 3 &&
                    grid[i][j]== grid[i+1][j] == grid[i+2][j] ||
                    i+1 < 3 && j+1 <3 && i+2 < 3 && j+2 < 3 &&
                    grid[i][j]== grid[i+1][j+1]== grid[i+2][j+2] ||
                    i+1 <3 && j-1 > 0 && i+2 < 3 && j-2 >0 &&
                    grid[i][j] == grid[i+1][j]== grid[i+2][j-2])
                    return true;
            }
        }
    }
}
