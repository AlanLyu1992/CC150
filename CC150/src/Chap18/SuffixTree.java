package Chap18;
import java.util.*;
public class SuffixTree {
    Node root;
    String str;
    public SuffixTree(String s) {
        str = s;
        root = growTree(s);
    }
    private Node growTree(String s) {
        int len = s.length();
        Node nullPrev = new Node(0, -1, null, null);
        Node r = new Node(0, -1, null, null);
        r.parent = r;
        r.link = r;
        Node n = r;
        for(int i = 0, rRange = 0; i < len; i++, rRange++) {
            char sCur = s.charAt(i);
            Node prev = nullPrev;
            while(rRange >= 0) {
                int nRange = n.end - n.start;
                if(rRange > nRange) {
                    char nNext = s.charAt(i - rRange + nRange + 1);
                    if(n.sons.containsKey(nNext)) {
                        n = n.sons.get(nNext);
                    }else {
                        n.sons.put(nNext, new Node(i-rRange, len-1, n, r));
                        prev.link = n;
                        prev = n;
                        n = n.parent.link;
                        rRange--;
                    }
                }else {
                    char nCur = s.charAt(n.start+rRange);
                    if(nCur == sCur) {
                        break;
                    }else {
                        int nEnd = n.start+rRange-1;
                        int nStart = n.start+n.parent.end-n.parent.start+1;
                        Node newN = new Node(n.start, nEnd, n.parent, r);
                        newN.sons.put(nCur, n);
                        n.parent.sons.put(s.charAt(nStart),newN);
                        n.parent = newN;
                        n = newN;
                    }
                }
            }
        }
        return r;
    }
    public String match(String p) {
        int lenP = p.length();
        int lenS = str.length();
        if(lenP > lenS) {
            return null;
        }
        Node node = root;
        for(int i = 0; i < lenP; i++) {
            char cur = p.charAt(i);
            if(i > node.end - node.start) {
                if(node.sons.containsKey(cur)) {
                    node = node.sons.get(cur);
                }else {
                    return null;
                }
            }
            if(cur != str.charAt(node.start+i)) {
                return null;
            }
        }
        return str.substring(node.start);
    }
}

        


