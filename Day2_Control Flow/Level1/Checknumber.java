package Level1;
import java.util.Scanner;
public class Checknumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number >= 1)
			System.out.println("Positive");
		else if (number<0)
			System.out.println("negetive");
		else
			System.out.println("Zero");
	}
}
