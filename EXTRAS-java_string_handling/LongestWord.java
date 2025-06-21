import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String l = "", w = "";
        for (int i = 0; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) != ' ') w += s.charAt(i);
            else {
                if (w.length() > l.length()) l = w;
                w = "";
            }
        }
        System.out.println(l);
    }
}
