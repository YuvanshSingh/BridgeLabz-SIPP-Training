package Day4_Methods.Level2;

import java.util.Scanner;

public class NumberAnalyzer {
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.println("Number " + numbers[i] + " is positive and " + 
                                 (isEven(numbers[i]) ? "even" : "odd"));
            } else {
                System.out.println("Number " + numbers[i] + " is negative");
            }
        }

        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("First number is ");
        if (comparison > 0) {
            System.out.println("greater than the last number");
        } else if (comparison < 0) {
            System.out.println("less than the last number");
        } else {
            System.out.println("equal to the last number");
        }

        scanner.close();
    }
}
