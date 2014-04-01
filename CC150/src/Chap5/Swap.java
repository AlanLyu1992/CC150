package Chap5;
public class Swap {
    public static int swap(int n) {
        //get even filter & odd filter
        int evenfilter = 1;
        for(int i = 0; i < 30; i++) {
            evenfilter = (evenfilter << 2) + 1;
        }
        int oddfilter = evenfilter << 1;
        //get even bits, left shift, get odd bits, right shift
        //then combine together
        int even = (n & evenfilter) << 1;
        int odd = (n & oddfilter) >> 1;
        return even | odd;
    }
}
