import java.util.Scanner;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') v++;
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) c++;
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}
