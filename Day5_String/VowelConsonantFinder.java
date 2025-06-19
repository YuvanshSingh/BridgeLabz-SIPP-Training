package Day5_String;
import java.util.Scanner;

public class VowelConsonantFinder {
    public static String checkCharacter(char c) {
        c = Character.toLowerCase(c);
        if (!Character.isLetter(c)) return "Not a Letter";
        return "aeiou".indexOf(c) >= 0 ? "Vowel" : "Consonant";
    }

    public static String[][] analyzeString(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacter(text.charAt(i));
        }
        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Character | Type");
        System.out.println("-----------------");
        for (String[] result : results) {
            System.out.printf("%-10s| %s%n", result[0], result[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        String[][] analysis = analyzeString(text);
        displayResults(analysis);
        scanner.close();
    }
}
