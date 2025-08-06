// 5. Recursive vs Iterative Fibonacci Computation
public class FibonacciRuntimeAnalysis {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void compareFibonacci(int n) {
        long start = System.nanoTime();
        fibonacciRecursive(n);
        long recursiveTime = System.nanoTime() - start;
        start = System.nanoTime();
        fibonacciIterative(n);
        long iterativeTime = System.nanoTime() - start;
        System.out.println("Recursive Fibonacci time: " + recursiveTime + " ns");
        System.out.println("Iterative Fibonacci time: " + iterativeTime + " ns");
    }
}
