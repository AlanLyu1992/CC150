package Chap18;
public class Max {
    public static Rectangle max(int[][] grid) {
        //argcheck;
        int N = grid.length;
        int max = (1<<31);
        int sum = 0;
        int mright, mleft, left, mrow, mheight;
        //similar to get max subsequence of int array, we compress the 
        //dimension by get sum of each line first;
        int[][][] line = new int[N][N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int sum = 0;
                for(int k = 0; j+k < N; k++) {
                    sum += grid[i][j+k];
                    line[j][k][i] = sum;
                }
            }
        }
        for(int j = 0; i < N; i++) {
            for(int k = 0; k+i < N; i++) {
                left = 0;
                sum = 0;
                for(int j = 0; j < N; j++) {
                    int n = line[j][k][i];
                    if(sum < 0) {
                        sum = n;
                        left = i;
                    }else {
                        sum += n;
                    }
                    if(sum > max) {
                        max = sum;
                        mright = i;
                        mleft = left;
                        mrow = j;
                        mheight = k;
                    }
                }
            }
        }
        Rectangle rec = new Rectangle(mleft, mrow, mheight+1,
                                      mright-mleft+1, max);
        return rec;
    }
}
class Rectangle {
    int row;
    int col;
    int length;
    int height;
    int maxSum;
    Rectangle(a, b, c, d, e) {
        row = a;
        col = b;
        length = c;
        height = d;
        maxSum = e;
    }
}

