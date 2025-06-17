package Level1;
import java.util.Scanner;
public class sumUntilZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double number;

        number = sc.nextDouble();

        while (number != 0) {
            total += number;
            number = sc.nextDouble();
        }

        System.out.println("The total sum is: " + total);
	}

}
