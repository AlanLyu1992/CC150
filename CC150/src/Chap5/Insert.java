package Chap5;
public class Insert {
    public static int insert(int M, int N, int i, int j) {
        return (N & ~((1<<(j-1+1))-1) | (M << i));
    }
}
