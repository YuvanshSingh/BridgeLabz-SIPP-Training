package Level1;
import java.util.Scanner;
public class Sumofnaturalnumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
        	int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println(" There is a mismatch in the results.");
            }
	}
	}
}
