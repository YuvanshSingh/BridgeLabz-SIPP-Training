package Day5_String;
import java.util.Scanner;

public class StringTrimmer {
    public static int[] findTrimPoints(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

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
        System.out.println("Enter text with spaces: ");
        String text = scanner.nextLine();

        int[] points = findTrimPoints(text);
        String customTrimmed = createSubstring(text, points[0], points[1]);
        String builtInTrimmed = text.trim();

        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtInTrimmed + "'");
        System.out.println("Results match: " + compareStrings(customTrimmed, builtInTrimmed));
        scanner.close();
    }
}
