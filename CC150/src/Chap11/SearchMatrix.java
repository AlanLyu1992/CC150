package Chap11;
public class SearchMatrix {
    private static Coord search(int[][] mat, int x) {
        int m = mat.length;
        int n = mat[0].length;
        int j = n-1;
        int i = 0;
        //when j > 0, search on ith line from 0 to j, if found, return, else
        //search on (i+1)th line fro 0 to j-1, until j == 0, then vertical search
        while(j > 0) {
            int p = bSearch(mat, i, j, 0, x);
            if(p >= 0) {
                return new Coord(i, p);
            }else if(p == -1) {
                return new Coord(-1, -1);
            }else {
                i++;
                j=-p-2;
            }
        }
        int p = bSearch(mat, i, 0, 1, x);
        if(p >= 0) {
            return new Coord(p, 0);
        }else {
            return new Coord(-1,-1);
        }
    }
    //axis = 0 means search row, axis =1 means search column
    private static int bSearch(int[][] mat, int i, int j, int axis, int x){
        if(axis == 0) {
            int low = 0;
            int high = j;
            while(low <= high) {
                int mid = (low+high)>>>1;
                if(mat[i][mid] == x) {
                    return mid;
                }else if(mat[i][mid] < x) {
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
            return -low-1;
        }else {
            int low = i;
            int high = m-1;
            while(low <= high) {
                int mid = (low+high)>>>1;
                if(mat[mid][0] == x) {
                    return mid;
                }else if(mat[mid][0] < x) {
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
            return -low-1;
        }
    }
}
class Coord {
    int x;
    int y;
    Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }
}




