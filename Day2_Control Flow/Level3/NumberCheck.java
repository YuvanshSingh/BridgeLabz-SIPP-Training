package Level3;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }
        if (number % sum == 0) {
            System.out.println("The number is a Harshad Number");
        } else {
            System.out.println("The number is Not a Harshad Number");
        }
    }
}
