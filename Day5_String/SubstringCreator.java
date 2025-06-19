package Day5_String;
import java.util.Scanner;

public class SubstringCreator {
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
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
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String customSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("Custom substring: " + customSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);
        System.out.println("Results match: " + compareStrings(customSubstring, builtInSubstring));
        scanner.close();
    }
}
