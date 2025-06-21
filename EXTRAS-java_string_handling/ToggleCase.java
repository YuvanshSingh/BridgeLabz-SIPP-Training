import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine(), r = "";
        for (char c : s.toCharArray())
            r += c >= 'A' && c <= 'Z' ? (char)(c + 32) : c >= 'a' && c <= 'z' ? (char)(c - 32) : c;
        System.out.println(r);
    }
}
