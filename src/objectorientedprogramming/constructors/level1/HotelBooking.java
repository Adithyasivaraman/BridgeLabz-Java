import java.util.Scanner;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void display() {
        System.out.println(guestName);
        System.out.println(roomType);
        System.out.println(nights);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking(sc.nextLine(), sc.nextLine(), sc.nextInt());
        HotelBooking h3 = new HotelBooking(h2);
        h1.display();
        h2.display();
        h3.display();
    }
}
