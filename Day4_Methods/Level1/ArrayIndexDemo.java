import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] names) {
        String name = names[names.length + 1];
    }

    public static void handleException(String[] names) {
        try {
            String name = names[names.length + 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        
        for(int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = scanner.next();
        }

        System.out.println("Generating exception...");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\nHandling exception...");
        handleException(names);
        scanner.close();
    }
}
