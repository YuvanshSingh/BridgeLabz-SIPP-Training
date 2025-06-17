package Day1_Problems;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int years = input.nextInt();
        
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.printf("Bonus amount: %.2f%n", bonus);
        } else {
            System.out.println("No bonus applicable (service less than 5 years)");
        }
        input.close();
    }
}
