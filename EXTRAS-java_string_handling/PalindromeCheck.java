import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int n = s.length(), p = 1;
        for (int i = 0; i < n / 2; i++) if (s.charAt(i) != s.charAt(n - 1 - i)) p = 0;
        System.out.println(p == 1 ? "Palindrome" : "Not Palindrome");
    }
}
