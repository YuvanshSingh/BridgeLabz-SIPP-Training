import java.util.Scanner;
public class MostFrequentChar {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        char res = ' '; int max = 0;
        for (char c : s.toCharArray()) {
            int count = 0;
            for (char d : s.toCharArray()) if (c == d) count++;
            if (count > max) { max = count; res = c; }
        }
        System.out.println(res);
    }
}
