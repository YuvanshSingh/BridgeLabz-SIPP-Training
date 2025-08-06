// 1. Search a Target in a Large Dataset: Linear vs Binary Search
import java.util.Arrays;

public class SearchRuntimeAnalysis {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void compareSearch(int[] arr, int target) {
        long start = System.nanoTime();
        linearSearch(arr, target);
        long linearTime = System.nanoTime() - start;
        Arrays.sort(arr);
        start = System.nanoTime();
        binarySearch(arr, target);
        long binaryTime = System.nanoTime() - start;
        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println("Binary Search Time: " + binaryTime + " ns");
    }
}
