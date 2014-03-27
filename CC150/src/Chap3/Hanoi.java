package Chap3;
import java.util.*;
public class Hanoi {
    private final List<Deque<Integer>> stacks;
    private final int num;
    public Hanoi(int n) {
        num = n;
        stacks = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            stacks.add(new ArrayDeque<>());
        }
        for(int i = num-1; i>=0; i--) {
            stacks.get(0).push(i);
        }
    }
    public void solve() {
        move(num, 0, 1, 2);
    }
    private void sout(int elem, int start, int target) {
            System.out.println(String.format(
                        "move %d from stack %d to stack %d",
                        elem, start, target));
    }

    private void move(int n, int start, int middle, int target) {
        if(n == 1) {
            int elem = stacks.get(start).pop();
            stacks.get(target).push(elem);
            sout(elem, start,target);
        }else {
            move(n-1, start, target, middle);
            int elem = stacks.get(start).pop();
            stacks.get(target).push(elem);
            sout(elem, start,target);
            move(n-1,middle, start, target);
        }
    }
}
