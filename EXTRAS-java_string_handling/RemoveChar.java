import java.util.Scanner;
public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char r = sc.nextLine().charAt(0);
        for (char c : s.toCharArray()) if (c != r) System.out.print(c);
    }
}
