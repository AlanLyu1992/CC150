package Chap11;
import java.lang.reflect.*;
public class LoserTree<E extends Comparable<? super E>> {
    int len;
    int[] lsTree;
    E[] elems;
    E min;
    E max;

    @SuppressWarnings("unchecked")
    LoserTree(Class<E> type, int len, E min, E max) {
        this.len = len;
        this.min = min;
        this.max = max;
        lsTree = new int[len];
        elems = (E[])Array.newInstance(min.getClass(), len+2);
        elems[len] = min;
        elems[len+1] = max;
        for(int i = 0; i < len; i++) {
            lsTree[i] = len;
        }
    }
    public void set(int i, E elem) {
        //TODO check i
        elems[i] = (elem == null? max : elem);
        for(int p = (i+len)/2; p > 0; p /= 2) {
            if(elems[i].compareTo(elems[lsTree[p]]) > 0) {
                int temp = lsTree[p];
                lsTree[p] = i;
                i = temp;
            }
        }
        lsTree[0] = i;
    }
    public E winner() {
        return elems[lsTree[0]];
    }
    public int winnerIdx() {
        return lsTree[0];
    }
    public boolean isEmpty() {
        return winner().equals(max);
    }
    public boolean isMature() {
        return winnerIdx() != len;
    }
}
        

    


