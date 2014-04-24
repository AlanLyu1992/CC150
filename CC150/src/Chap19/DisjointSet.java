package Chap19;
import java.util.Scanner;
import java.io.*;
public class DisjointSet {
    public static void main(String[] args) throws Exception{
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number of sticks");
        int n = s.nextInt();
        s.nextLine();
        Trie trie = new Trie();
        for(int i = 0; i < n; i++){
            trie.addStick(s.nextLine());
        }
        */
        //String[] sticks = {"red blue", "blue green", "red blue"};
        
        /*
        String[] sticks = {"blue red","red violet","cyan blue",
                           "blue magenta","magenta cyan"};
        //String[] sticks = {"a b", "b c", "c d", "d b","b e","a c","a d"};
        Trie trie = new Trie();
        int n = sticks.length;
        for(int i = 0; i < n; i++){
            trie.addStick(sticks[i]);
        }
        */
        /*
        File file = new File("/home/yin/sticks");
        Scanner s = new Scanner(file);
        Trie trie = new Trie();
        while(s.hasNextLine()) {
            trie.addStick(s.nextLine());
        }
        */
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        Trie trie = new Trie();
        String stick;
        while((stick = re.readLine()) != null) {
            trie.addStick(stick);
        }
        if(trie.isEuler()) {
            System.out.println("Possible");
        }else {
            System.out.println("Impossible");
        }
    }
}
class Trie {
    class Node {
        int ColorIdx;
        Node[] son;
        Node(int i) {
            ColorIdx = i;
            son = new Node[26];
        }
    }

    Node root;
    int ColorCount;
    int[] parent;
    int[] degree;
    int[] rank;
    //final int MAXCOLOR = 500000;
    final int MAXCOLOR = 20;
    Trie() {
        root = new Node(-1);
        ColorCount = 0;
        degree = new int[MAXCOLOR];
        rank = new int[MAXCOLOR];
        parent = new int[MAXCOLOR];
        for(int i = 0; i < MAXCOLOR; i++) {
            parent[i] = i;
        }
    }
    int add(String color) {
        int len = color.length();
        Node node = root;
        for(int i = 0; i < len; i++) {
            int idx = color.charAt(i)-'a';
            if(node.son[idx]== null) {
                node.son[idx] = new Node(-1);
            }
            node = node.son[idx];
        }
        if(node.ColorIdx == -1) {
           node.ColorIdx = ColorCount++;
        }
        degree[node.ColorIdx]++;
        return node.ColorIdx;
    }
    int findSet(int i) {
        if(i != parent[i]) {
            parent[i] = findSet(parent[i]);
        }
        return parent[i];
    }
    void union(int i, int j) {
        i = findSet(i);
        j = findSet(j);
        if(i == j) {
            return;
        }
        if(rank[i] > rank[j]) {
            parent[j] = i;
        }else {
            parent[i] = j;
            if(rank[i] == rank[j]) {
                rank[j]++;
            }
        }
    }
    void addStick(String stick){
        String[] colors = stick.split(" ");
        int i = add(colors[0]);
        int j = add(colors[1]);
        union(i, j);
        findSet(i);
        findSet(j);
    }
    boolean isEuler(){
        int dad = findSet(0);
        int oddDegreeCount = 0;
        for(int i = 0; i < ColorCount; i++) {
            if(degree[i] % 2 == 1) {
                oddDegreeCount++;
            }
            if(findSet(i) != dad || oddDegreeCount > 2) {
                return false;
            }
        }
        return true;
    }
}

            
