package Chap3;

public class ThreeStacks<T> {
    int[] capacity;
    int[] size;
    int[] index;
    Object[] stack;
    public ThreeStacks(int len1, int len2, int len3 ) {
        capacity = new int[3];
        size = new int[3];
        index = new int[3];
        stack = new Object[len1+len2+len3];
        capacity[0] = len1; index[0] = 0;
        capacity[1] = len1; index[1] = len1;
        capacity[2] = len1; index[2] = len1+len2;
    }
    public void push(int stackNum, T data) {
        if(size[stackNum] == capacity[stackNum]) {
            throw new fullStackException();
        }
        stack[index[stackNum]] = data;
        index[stackNum]++;
        size[stackNum]++;
    }
    public T pop(int stackNum) {
        if(isEmpty(stackNum)) {
            throw new emptyStackException();
        }
        @SuppressWarnings("unchecked")
        T data = (T)stack[index[stackNum]-1];
        index[stackNum]--;
        size[stackNum]--;
        return data;
    }
    public T peek(int stackNum) {
        if(isEmpty(stackNum)) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T data = (T)stack[index[stackNum]-1];
        index[stackNum]--;
        size[stackNum]--;
        return data;
    }
    public boolean isEmpty(int stackNum) {
        return size[stackNum] == 0;
    }
}
class fullStackException extends RuntimeException{};
class emptyStackException extends RuntimeException{};





