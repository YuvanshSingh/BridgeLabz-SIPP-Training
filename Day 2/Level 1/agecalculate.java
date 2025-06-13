import java.util.Scanner;
public class agecalculate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int currentyear =2024; 
		System.out.print("enter the birthyear:- ");
		int birthyear = sc.nextInt() ;
		int age = currentyear - birthyear;
		System.out.println("Harry age in 2024 is:- " + age);

	}

}
