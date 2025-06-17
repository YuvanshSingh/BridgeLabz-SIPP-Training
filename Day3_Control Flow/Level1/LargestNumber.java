package Level1;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		 if (number1 > number2 && number1 > number3) {
	            System.out.println("Is the first number the largest? true");
	            System.out.println("Is the second number the largest? false");
	            System.out.println("Is the third number the largest? false");
	        } else if (number2 > number1 && number2 > number3) {
	            System.out.println("Is the first number the largest? false");
	            System.out.println("Is the second number the largest? true");
	            System.out.println("Is the third number the largest? false");
	        } else if (number3 > number1 && number3 > number2) {
	            System.out.println("Is the first number the largest? false");
	            System.out.println("Is the second number the largest? false");
	            System.out.println("Is the third number the largest? true");
	        } else {	            
	            System.out.println("There is a tie among the largest numbers.");
	        }
	}
}
