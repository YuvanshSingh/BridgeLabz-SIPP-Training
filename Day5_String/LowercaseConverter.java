package Day5_String;
import java.util.Scanner;

public class LowercaseConverter {
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result.append(c >= 'A' && c <= 'Z' ? (char)(c + 32) : c);
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

        String customLower = convertToLowerCase(text);
        String builtInLower = text.toLowerCase();
        
        System.out.println("Custom lowercase: " + customLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Results match: " + compareStrings(customLower, builtInLower));
        scanner.close();
    }
}
