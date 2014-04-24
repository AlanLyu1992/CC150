package Chap18;
public class MedianArray {
    Heap less;
    Heap more;
    MedianArray() {
        less = new Heap(1);
        more = new Heap(-1);
    }
    public void add(int n) {
        if(isOdd()) {
            int median =less.peek();
            if(n < median) {
                less.set(0, n);
                more.add(median);
            }else {
                more.add(n);
            }
        }else {
            int upperMedian = more.peek();
            if(n < upperMedian) {
                less.add(n);
            }else {
                more.set(0, n);
                less.add(upperMedian);
            }
        }
    }
    public double median() {
        if(isOdd()) {
            return (double) less.peek();
        }else {
            return (less.peek()+more.peek())>>>1;
        }
    }
    public boolean isOdd() {
        return (less.size()+more.size()) % 2 == 1
    }
}


