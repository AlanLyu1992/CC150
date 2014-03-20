void removeDuplicate(StringBuilder s) {
    if(s == null) return;
    int len = s.length();
    int count = 0;
    for(int i =0; i < len; i++) {
        char c = s.charAt(i);
        for(int j = 0;  < i; j++) {
            chard = s.charAt(j);
            if(c == d) {
                break;
            }
        }
        if(j == i) {
            s.setCharAt(count, s.charAt(j));
            count++;
        }
    }
    s.setLength(count);
}
