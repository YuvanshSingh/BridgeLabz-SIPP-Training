import java.util.Scanner;

public class DigitAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int temp = Math.abs(number);
        
        while (temp != 0 && index < maxDigit) {
            digits[index++] = temp % 10;
            temp /= 10;
        }
        
        if (index == 0) {
            System.out.println("No digits found in the number.");
            scanner.close();
            return;
        }
        
        int largest = digits[0];
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest digit: " + largest);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
        
        scanner.close();
    }
}
