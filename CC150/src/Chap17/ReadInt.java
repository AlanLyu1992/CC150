package Chap17;
public class ReadInt {
    public static String ReadInt(int n) {
        StringBuilder s = new StringBuilder();
        if(n < 0 ) {
            s.append("Minus");
        }
        int q = n/Math.pow(10,9);
        if(q > 0) {
            s.append(rOne(q)).append("Billion");
        }
        n %= Math.pow(10,9);
        q = n/Math.pow(10,6);
        if(q > 0) {
            s.append(rHundred(q)).append("Million");
        }
        n %= Math.pow(10,6);
        q = n/1000;
        if(q > 0) {
            s.append(rHundred(q).append("Thousand");
        }
        n %= 1000;
        s.append(rHundred(q));
        return s.toString();
    }
    private static StringBuilder rHundred(int n) {
        StringBuilder s = new StringBuilder();
        int q = n/100;
        if(q > 0) {
            s.append(rOne(q)).append("Hundred");
        }
        n %= 100;
        q = n/10;
        int r = n % 10;
        switch(q) {
            case 9 : s.append("Ninety"); break;
            case 8 : s.append("Eighty"); break;
            case 7 : s.append("Seventy"); break;
            case 6 : s.append("Sixty"); break;
            case 5 : s.append("Fifty"); break;
            case 4 : s.append("Forty"); break;
            case 3 : s.append("Thirty"); break;
            case 2 : s.append("Twenty"); break;
            case 1 : s.append(rTeen(n)); break;
            case 0 : s.append(rOne(n)); break;
        }
        if(q > 1 && r > 0) {
            s.append(rOne(r));
        }
        return s;
    }
    private static StringBuilder rTeen(int n) {
        StringBuilder s = new StringBuilder();
        switch(n) {
            case 19 : s.append("Nineteen"); break;
            case 18 : s.append("Eighteen"); break;
            case 17 : s.append("Seventeen"); break;
            case 16 : s.append("Sixteen"); break;
            case 15 : s.append("Fifteen"); break;
            case 14 : s.append("Fourteen"); break;
            case 13 : s.append("Thirteen"); break;
            case 12 : s.append("Twelve"); break;
            case 11 : s.append("Eleven"); break;
            case 10 : s.append("Ten"); break;
        }
        return s;
    }
    private static StringBuilder rOne(int n) {
        StringBuilder s = new StringBuilder();
        switch(n) {
            case 9 : s.append("Nine"); break;
            case 8 : s.append("Eight"); break;
            case 7 : s.append("Seven"); break;
            case 6 : s.append("Six"); break;
            case 5 : s.append("Five"); break;
            case 4 : s.append("Four"); break;
            case 3 : s.append("Three"); break;
            case 2 : s.append("Two"); break;
            case 1 : s.append("One"); break;
            case 0 : s.append("Zero"); break;
        }
        return s;
    }
}
