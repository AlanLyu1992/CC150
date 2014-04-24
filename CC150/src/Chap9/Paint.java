package Chap9;
import java.util.*;
public class Paint {
    public static void paint(int[][] image, int nc, int i, int j) {
        //argcheck;
        int m = image.length;
        int n = image[0].length;
        if(i < 0|| i > m || j < 0 || j > n ) {
            throw new IllegalArgumentException();
        }
        int oc = image[i][j];
        Queue<Coord> border = new ArrayDeque<>();
        border.offer(new Coord(i,j));
        while(!border.isEmpty()) {
            int c = border.poll();
            int x = c.x;
            int y = c.y;
            image[x][y] = nc;
            if(image[x-1][y] == oc) {
                image[x-1][y] = nc;
                border.offer(oc);
            }
            if(image[x+1][y] == oc) {
                image[x+1][y] = nc;
                border.offer(oc);
            }
            if(image[x][y-1] == oc) {
                image[x][y-1] = nc;
                border.offer(oc);
            }
            if(image[x][y+1] == oc) {
                image[x][y+1] = nc;
                border.offer(oc);
            }
        }
    }
}
            
