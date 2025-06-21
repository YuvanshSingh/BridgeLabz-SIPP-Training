import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        System.out.println("Format 1: " + date.format(fmt1));
        System.out.println("Format 2: " + date.format(fmt2));
        System.out.println("Format 3: " + date.format(fmt3));
    }
}
