import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = Math.abs(number);
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }
        
        int[] digits = new int[digitCount];
        temp = Math.abs(number);
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        int[] reversed = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversed[i] = digits[digitCount - 1 - i];
        }
        
        System.out.println("Original number: " + number);
        System.out.print("Reversed number: ");
        if (number < 0) {
            System.out.print("-");
        }
        for (int digit : reversed) {
            System.out.print(digit);
        }
        
        scanner.close();
    }
}
