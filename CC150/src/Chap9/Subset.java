package Chap9;
import java.util.*;
public class Subset {
    public static List<List<Integer>> subset(Set<I> set) {
        int[] arr = set.toarray(set.size());
        List<List<Integer>> collection = new ArrayList<>();
        collection.add(new ArrayList<>());
        List<Integer> subset = new ArrayList<>();
        find(collection, subset, arr, 0);
        return collection;
    }
    private static void find(List<List<Integer>> collection, List<I>subset,
                             int[] arr, int i) {
        List<Integer> newSubset = new ArrayList<>(subset);
        newSubset.add(arr[i]);
        collection.add(newSubset);
        if(i+1 < len) {
            find(collection, newSubset, arr, i+1);
        }
        find(collection, subset, arr, i+1);
    }
}
