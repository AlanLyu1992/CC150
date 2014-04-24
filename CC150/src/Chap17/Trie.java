package Chap17;
public class Trie {
    Node root;
    Node {
        int count;//not init?
        Node[] next;
        char val;
        Node(char x) {
            val = x;
            next = new Node[26];
        }
        Node() {
            this('\0');
        }
    }
    Trie() {
        root = new Node();
    }
    void add(String word) {
        int len = word.length();
        Node node = root;
        for(int i = 0; i < len; i++) {
            int idx = word.charAt(i)-'a';
            if(node.next[idx] == null) {
                node.next = new Node((char)(idx+'a'));
            }
            node = node.next[idx];
        }
        node.count++;
    }
    int find(String word) {
        Node node = root;
        int len = word.length();
        for(int i = 0; i < len; i++) {
            int idx = word.charAt(i)-'a';
            if(node.next[idx] == null) {
                return 0;
                break;
            }
            node = node.next[idx];
        }
        return node.count;
    }
}
