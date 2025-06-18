package Day4_Methods.Level2;

import java.util.Scanner;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        boolean isLeap = isLeapYear(year);
        System.out.println(year + (isLeap ? " is" : " is not") + " a leap year");

        scanner.close();
    }
}
