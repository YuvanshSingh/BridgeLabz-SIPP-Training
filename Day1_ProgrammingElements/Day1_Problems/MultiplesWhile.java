package Day1_Problems;

import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = input.nextInt();
        
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive number less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--;
            }
        }
        input.close();
    }
}
