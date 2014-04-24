package Chap9;
import java.util.*;
public class BoxStack {
    public static int boxStack(Box[] boxes) {
        //argcheck;
        int n = boxes.length;
        Arrays.sort(boxes, (x,y)->(x.h-y.h));
        int[] max = new int[n];
        max[0] = boxes[0].h;
        int tallest = max[0];
        for(int i = 1; i < n; i++) {
            int temp = boxes[i].h;
            for(int j = 0; j<i; j++){
                if(boxes[i].contains[boxes[j]] &&
                        boxes[i].h+boxes[j].h > temp)
                    temp = boxes[i].h+max[j];
            }
        }
        max[i] = temp;
        if(temp > tallest) {
            tallest = temp;
        }
    }
}
class Box {
    int h;
    int w;
    int d;
    public Box(int h, int w, int d) {
        if(h <= 0 || w <= 0 || d <= 0) {
            throw new IllegalArgumentException();
        }
        this.h = h;
        this.w = w;
        this.d = d;
    }
    boolean contains(Box that) {
        return this.h > this.h &&
               this.w > this.w &&
               this.d > this.d
    }
}
