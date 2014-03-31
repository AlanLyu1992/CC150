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
        Map<Integer, DirectedGraphNode> map = new HashMap<>();
        int len = A.length;
        for(int i = 0; i < len; i++) {
            if(!map.containsKey(A[i])) {
                map.put(A[i], new DirectedGraphNode(A[i]));
            }
            DirectedGraphNode node = map.get(A[i]);
            i++;
            while(i < len && A[i] != sep) {
                if(!map.containsKey(A[i])) {
                    map.put(A[i], new DirectedGraphNode(A[i]));
                }
                node.next.add(map.get(A[i]));
                i++;
            }
        }
        return map.get(A[0]);
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
	    node.next.stream().map((nextNode) -> {
			System.out.print(nextNode.label+" ");
			return nextNode;
		}).filter((nextNode) -> (!set.contains(nextNode))).map((nextNode) -> {
			set.add(nextNode);
			return nextNode;
		}).forEach((nextNode) -> {
			queue.offer(nextNode);
		});
            System.out.print(sep+" ");
        }
    }
    /*
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
    */
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
    /*
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
    */
}
