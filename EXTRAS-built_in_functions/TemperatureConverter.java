import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double temp = sc.nextDouble();
        if (choice == 1) System.out.println(fToC(temp));
        else System.out.println(cToF(temp));
    }
    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }
    static double cToF(double c) {
        return c * 9 / 5 + 32;
    }
}
