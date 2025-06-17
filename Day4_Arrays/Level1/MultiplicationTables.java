public class MultiplicationTables {
    public static void main(String[] args) {
        int[] numbers = {6, 7, 8, 9};
        int[] results = new int[40];
        
        for (int num : numbers) {
            System.out.println("\nMultiplication table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                results[(num - 6) * 10 + (i - 1)] = result;
                System.out.println(num + " * " + i + " = " + result);
            }
        }
    }
}
