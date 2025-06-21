import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), w1 = sc.nextLine(), w2 = sc.nextLine(), res = "";
        for (int i = 0; i < s.length(); ) {
            if (i <= s.length() - w1.length() && s.substring(i, i + w1.length()).equals(w1)) {
                res += w2;
                i += w1.length();
            } else {
                res += s.charAt(i);
                i++;
            }
        }
        System.out.println(res);
    }
}
