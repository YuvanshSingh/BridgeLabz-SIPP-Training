package Level1;
import java.util.Scanner;
public class Sumofnaturalnubmer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum;
		if(number>=1) {
			sum=(number*(number+1)/2);
			System.out.println("the sum of "+ number +" nutural number is "+ sum);
		}else {
			System.out.println("not a natural no ");
		}		
	}
}
