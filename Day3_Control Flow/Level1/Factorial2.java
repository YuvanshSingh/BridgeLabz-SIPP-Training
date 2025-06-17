package Level1;
import java.util.Scanner;
public class Factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
        	long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
	}
	}
}
