package Day5_String;
import java.util.Scanner;

public class CharArrayConverter {
    public static char[] stringToCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] customArray = stringToCharArray(text);
        char[] builtInArray = text.toCharArray();

        System.out.print("Custom array: ");
        for (char c : customArray) System.out.print(c + " ");
        System.out.print("\nBuilt-in array: ");
        for (char c : builtInArray) System.out.print(c + " ");
        System.out.println("\nArrays match: " + compareCharArrays(customArray, builtInArray));
        scanner.close();
    }
}
