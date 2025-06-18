import java.util.Scanner;

public class StringIndexDemo {
    public static void generateException(String text) {
        char c = text.charAt(text.length() + 1);
    }

    public static void handleException(String text) {
        try {
            char c = text.charAt(text.length() + 1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
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
