package Day1_Problems;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        int count = 0;
        int temp = Math.abs(number);  // Handle negative numbers
        
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }
        
        System.out.println("Number of digits in " + number + " is: " + count);
        input.close();
    }
}
