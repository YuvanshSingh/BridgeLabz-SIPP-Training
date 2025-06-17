package Day1_Problems;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int sum = 0;
            int temp = number;
            
            while (temp > 0) {
                sum += temp % 10;  // Add last digit to sum
                temp = temp / 10;  // Remove last digit
            }
            
            if (number % sum == 0) {
                System.out.println(number + " is a Harshad Number");
                System.out.println("Sum of digits: " + sum);
                System.out.println(number + " ÷ " + sum + " = " + (number/sum));
            } else {
                System.out.println(number + " is not a Harshad Number");
            }
        }
        input.close();
    }
}
