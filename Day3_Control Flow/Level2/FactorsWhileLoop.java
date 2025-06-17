
package Level1;
import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            int i = 1;
            System.out.println("Factors of " + number + " are:");
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
        scanner.close();
    }
}