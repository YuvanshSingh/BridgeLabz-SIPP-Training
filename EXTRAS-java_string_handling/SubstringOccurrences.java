import java.util.Scanner;
public class SubstringOccurrences {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine(), sub = new Scanner(System.in).nextLine();
        int c = 0, i = 0;
        while ((i = s.indexOf(sub, i)) != -1) { c++; i++; }
        System.out.println(c);
    }
}
