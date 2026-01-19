import java.util.Scanner;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }

    void display() {
        System.out.println(movieName);
        System.out.println(seatNumber);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket t = new MovieTicket();
        t.movieName = sc.nextLine();
        t.bookTicket(sc.nextInt(), sc.nextDouble());
        t.display();
    }
}
