import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String s = takeInput();
        if (isPalindrome(s)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    static String takeInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
