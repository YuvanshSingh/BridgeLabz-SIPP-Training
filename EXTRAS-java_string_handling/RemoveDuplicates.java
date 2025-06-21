import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine(), r = "";
        for (char c : s.toCharArray()) if (r.indexOf(c) < 0) r += c;
        System.out.println(r);
    }
}
