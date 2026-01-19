import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate d1 = LocalDate.parse(sc.nextLine());
        LocalDate d2 = LocalDate.parse(sc.nextLine());

        if (d1.isBefore(d2)) System.out.println("Before");
        else if (d1.isAfter(d2)) System.out.println("After");
        else System.out.println("Same");
    }
}
