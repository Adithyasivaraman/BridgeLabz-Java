import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.parse(sc.nextLine());
        System.out.println(
                date.plusDays(7)
                        .plusMonths(1)
                        .plusYears(2)
                        .minusWeeks(3)
        );
    }
}
