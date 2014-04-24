package Chap19;
public class LargestRectangle {
    public int find(int[] hist) {
        if(hist == null || hist.length == 0) return 0;
        StdRMQ rmq = new StdRMQ(hist);
        return getMaxRec(hist, rmq, 0, hist.length-1);
    }
    private int getMaxRec(int[] hist, StdRMQ rmq, int low, int high) {
        if(low > high) {
            return 0;
        }
        if(low == high) {
            return hist[low];
        }
        int minIdx = rmq.query(low, high);
        return max(hist[minIdx]*(high-low+1),
                   getMaxRec(hist, rmq, low, minIdx-1),
                   getMaxRec(hist, rmq, minIdx+1, high));
    }
    private int max(int a, int b, int c) {
        return a > b? (a > c ? a : c) : (b > c ? b : c);
    }
}


