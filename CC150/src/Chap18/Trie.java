package Chap18;
import java.util.*;
public class Trie {
    Node root;
    Node {
        boolean isEnd;
        Node[] next;
        char val;
        Node(char x) {
            val = x;
            isEnd = false;
            next = new Node[26];
        }
        Node() {
            this('\0');
        }
    }
    Trie(List<String> words) {
        root = new Node();
        for(String w : words) {
            add(w);
        }
    }
    public void add(String word) {
        int len = word.length();
        Node node = root;
        for(int i = 0; i < len; i++) {
            int idx = word.charAt(i)-'a';
            if(node.next[idx] == null) {
                node.next = new Node((char)(idx+'a'));
            }
            node = node.next[idx];
        }
        Node.isEnd = true;
    }
    public boolean match(String word) {
        Node node = root;
        int len = word.length();
        for(int i = 0; i < len; i++) {
            int idx = word.charAt(i)-'a';
            if(node.next[idx] == null) {
                return false;
            }
            node = node.next[idx];
        }
        return node.isEnd;
    }
}
