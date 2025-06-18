package Level1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
	}
	}
}
