package Chap5;
public class Draw {
    public static void draw(byte[] screen, int width, int x1, int x2, int y) {
        int lineStart = y * (width/8);
        int q1 = x1 / 8;
        int r1 = x1 % 8;
        int q2 = x2 / 8;
        int r2 = x2 % 8;
        if(q1 == q2) {
            fill(screen, lineStart+q1, 7-r1, 7-r2);
        }else {
            fill(screen, lineStart+q1, 7-r1, 0);
            for(int i = 1; i < q2-q1; i++) {
                fill(screen, lineStart+q1+i, 7, 0);
            }
            fill(screen, lineStart+q2, 7, 7-r2);
        }
    }
    private static void fill(byte[] screen, int i, int j, int k) {
        byte mask = (byte)((1 << j-k+1)-1);
        screen[i] |= mask;
    }
}

