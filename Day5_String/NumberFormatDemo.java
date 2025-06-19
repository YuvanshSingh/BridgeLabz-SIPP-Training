package Day5_String;
import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-numeric string: ");
        String text = scanner.next();

        System.out.println("Generating exception...");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\nHandling exception...");
        handleException(text);
        scanner.close();
    }
}
