import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }
}
