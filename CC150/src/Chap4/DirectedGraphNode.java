package Chap4;
import java.util.*;
public class DirectedGraphNode {
    int label;
    ArrayList<DirectedGraphNode> next;
    public DirectedGraphNode(int x) {
        label = x;
        next = new ArrayList<>();
    }
    public DirectedGraphNode genGraph(int[] A, int sep) {
        if(A == null || A.length == 0 || A[0] == sep) {
            return null;
        }
        Queue<DirectedGraphNode> queue = new ArrayDeque<>();
        Map<Integer, DirectedGraphNode> map = new HashMap<>();
        DirectedGraphNode start = new DirectedGraphNode(A[0]);
        queue.offer(start);
        map.put(A[0], start);
        int len = A.length;
        for(int i = 1; i < len; i++) {
            DirectedGraphNode node = queue.poll();
            while(i < len && A[i] != sep) {
                if(!map.containsKey(A[i])) {
                    DirectedGraphNode newNode = new DirectedGraphNode(A[i]);
                    map.put(A[i], newNode);
                    queue.offer(newNode);
                }
                node.next.add(map.get(A[i]));
                i++;
            }
        }
        return start;
    }
    public void printGraph(DirectedGraphNode start, String sep) {
        if(start == null|| sep == null) {
            return;
        }
        Queue<DirectedGraphNode> queue = new ArrayDeque<>();
        Set<DirectedGraphNode> set = new HashSet<>();
        queue.offer(start);
        set.add(start);
        while(!queue.isEmpty()) {
            DirectedGraphNode node = queue.poll();
            System.out.print(node.label+" ");
            for(DirectedGraphNode nextNode : node.next) {
                System.out.print(nextNode.label+" ");
                if(!set.contains(nextNode)) {
                    set.add(nextNode);
                    queue.offer(nextNode);
                }
            }
            System.out.print(sep+" ");
        }
    }
    public boolean isConnected(DirectedGraphNode start, DirectedGraphNode end) {
        if(start == null || end == null) {
            return false;
        }
        Queue<DirectedGraphNode> queue = new ArrayDeque<>();
        Set<DirectedGraphNode> set = new HashSet<>();
        queue.offer(start);
        set.add(start);
        while(!queue.isEmpty()) {
            DirectedGraphNode node = queue.poll();
            for(DirectedGraphNode nextNode : node.next) {
                if(nextNode == end) {
                    return true;
                }
                if(!set.contains(nextNode)) {
                    set.add(nextNode);
                    queue.offer(nextNode);
                }
            }
        }
        return false;
    }
}
