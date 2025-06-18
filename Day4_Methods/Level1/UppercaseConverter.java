import java.util.Scanner;

public class UppercaseConverter {
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        String customUpper = convertToUpperCase(text);
        String builtInUpper = text.toUpperCase();

        boolean areEqual = compareStrings(customUpper, builtInUpper);
        System.out.println("Custom uppercase: " + customUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Results are equal: " + areEqual);
        scanner.close();
    }
}
