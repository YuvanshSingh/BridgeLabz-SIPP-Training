import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        if (a.length() != b.length()) { System.out.println("Not Anagrams"); return; }
        int[] f = new int[256];
        for (int i = 0; i < a.length(); i++) { f[a.charAt(i)]++; f[b.charAt(i)]--; }
        for (int x : f) if (x != 0) { System.out.println("Not Anagrams"); return; }
        System.out.println("Anagrams");
    }
}
