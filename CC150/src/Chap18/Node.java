package Chap18;
import java.util.*;
public class Node {
    int start;
    int end;
    Node parent;
    Node link;
    Map<Character, Node> sons;
    Node(int start, int end, Node parent, Node link) {
        this.start = start;
        this.end = end;
        this.parent = parent;
        this.link = link;
        this.sons = new HashMap<>();
    }
}

