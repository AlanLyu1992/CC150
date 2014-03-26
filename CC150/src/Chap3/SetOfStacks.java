package Chap3;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;

public class SetOfStacks<E> {
    private final List<Deque<E>> stacks;
    private final int capacity;
    public SetOfStacks(int capacity) {
        if(capacity < 0) {
            capacity = 1;
        }
        this.capacity = capacity;
        stacks = new ArrayList<>();
        stacks.add(new ArrayDeque<>());
    }
    public void push(E data) {
        if(stacks.get(stacks.size()-1).size() == capacity) {
            stacks.add(new ArrayDeque<>());
        }
        stacks.get(stacks.size()-1).push(data);
    }
    public E pop() {
        int idx = stacks.size()-1;
        E data = stacks.get(idx).pop();
        if(stacks.get(idx).isEmpty() && idx > 0) {
            stacks.remove(idx);
        }
        return data;
    }
    public E popAt(int idx) {
        if(idx == stacks.size()-1) {
            return pop();
        }else {
            E data = stacks.get(idx).pop();
            while(idx != stacks.size()-1) {
                stacks.get(idx).push(stacks.get(idx+1).pollLast());
                idx++;
            }
            if(stacks.get(idx).isEmpty()) {
                stacks.remove(idx);
            }
            return data;
        }
    }
    public E peek() {
        return stacks.get(stacks.size()-1).peek();
    }
    public boolean isEmpty() {
        return stacks.isEmpty() && stacks.get(stacks.size()-1).isEmpty();
    }
}

