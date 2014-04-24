package Chap17;
public class Max {
    public static int max(int a, int b) {
        return (a+b+Math.abs(a-b))/2;
    }
}
