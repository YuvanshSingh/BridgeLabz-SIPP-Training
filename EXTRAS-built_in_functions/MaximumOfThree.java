import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        int[] nums = takeInput();
        int max = findMax(nums[0], nums[1], nums[2]);
        System.out.println("Maximum: " + max);
    }
    static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = sc.nextInt();
        return arr;
    }
    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
