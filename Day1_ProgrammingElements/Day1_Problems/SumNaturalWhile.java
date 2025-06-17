import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive natural number!");
            return;
        }

        int i = 1, loopSum = 0;
        while (i <= n) {
            loopSum += i;
            i++;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("While Loop Sum: " + loopSum);
        System.out.println("Formula Sum: " + formulaSum);

        System.out.println(loopSum == formulaSum ? "Both results match!" : "Results do not match!");
    }
}

