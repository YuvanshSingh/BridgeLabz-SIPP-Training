import java.util.Scanner;

public class DigitFrequencyAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        long temp = Math.abs(number);
        
        int digitCount = 0;
        long countTemp = temp;
        while (countTemp > 0) {
            digitCount++;
            countTemp /= 10;
        }
        
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }
        
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }
        
        System.out.println("\nFrequency analysis for number: " + number);
        System.out.println("--------------------------------");
        System.out.printf("%-6s %s%n", "Digit", "Frequency");
        System.out.println("--------------------------------");
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  
                System.out.printf("%-6d %d%n", i, frequency[i]);
            }
        }
        
        scanner.close();
    }
}
