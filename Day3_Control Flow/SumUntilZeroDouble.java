package Day1_Problems;

import java.util.Scanner;

public class SumUntilZeroDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double number;
        
        do {
            System.out.print("Enter a number (0 to exit): ");
            number = input.nextDouble();
            total += number;
        } while (number != 0);
        
        System.out.println("Total sum: " + total);
        input.close();
    }
}
