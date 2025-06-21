import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);
        LocalDate plus7Days = date.plusDays(7);
        LocalDate plus1Month = plus7Days.plusMonths(1);
        LocalDate plus2Years = plus1Month.plusYears(2);
        LocalDate minus3Weeks = plus2Years.minusWeeks(3);
        System.out.println("After adding 7 days: " + plus7Days);
        System.out.println("After adding 1 month: " + plus1Month);
        System.out.println("After adding 2 years: " + plus2Years);
        System.out.println("After subtracting 3 weeks: " + minus3Weeks);
    }
}
