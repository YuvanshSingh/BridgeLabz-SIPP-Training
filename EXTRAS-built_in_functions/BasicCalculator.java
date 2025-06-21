import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (op == 1) System.out.println(add(a, b));
        else if (op == 2) System.out.println(sub(a, b));
        else if (op == 3) System.out.println(mul(a, b));
        else if (op == 4) System.out.println(div(a, b));
    }
    static double add(double a, double b) { return a + b; }
    static double sub(double a, double b) { return a - b; }
    static double mul(double a, double b) { return a * b; }
    static double div(double a, double b) { return a / b; }
}
