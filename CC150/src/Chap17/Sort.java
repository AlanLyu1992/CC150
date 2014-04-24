package Chap17;
public class Sort {
    public static Result subSequence(int[] a) {
        int max = a[0];
        int len = a.length;
        Result res = new Result();
        for(int i = 1; i < len; i++) {
            if(a[i] < max) {
                res.n = i;
            }else if(a[i] > max) {
                max = a[i];
            }
        }
        int min = a[len-1];
        for(int i = len-1; i >= 0; i--) {
            if(a[i] > min) {
                res.m = i;
            }else if(a[i] < min) {
                min = a[i];
            }
        }
        if(res.n < res.m) {
            res.n = res.m;
        }
        return res;
    }
}
class Result {
    int m;
    int n;
}
