// 6. Comparing Different Data Structures for Searching: Array, HashSet, TreeSet
import java.util.*;

public class DataStructureSearchRuntimeAnalysis {
    public static void compareSearch(int[] arr, int target) {
        long start = System.nanoTime();
        for (int num : arr) if (num == target) break;
        long arrayTime = System.nanoTime() - start;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        start = System.nanoTime();
        set.contains(target);
        long hashSetTime = System.nanoTime() - start;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : arr) treeSet.add(num);
        start = System.nanoTime();
        treeSet.contains(target);
        long treeSetTime = System.nanoTime() - start;
        System.out.println("Array Search time: " + arrayTime + " ns");
        System.out.println("HashSet Search time: " + hashSetTime + " ns");
        System.out.println("TreeSet Search time: " + treeSetTime + " ns");
    }
}
