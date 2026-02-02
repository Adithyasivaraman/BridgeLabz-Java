class TicketNode {
    int ticketId;
    String customer, movie, seat, time;
    TicketNode next;

    TicketNode(int id, String customer, String movie, String seat, String time) {
        this.ticketId = id;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
    }
}

class TicketCircularList {
    private TicketNode head = null;

    public void addTicket(int id, String customer, String movie, String seat, String time) {
        TicketNode t = new TicketNode(id, customer, movie, seat, time);
        if (head == null) {
            head = t;
            t.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = t;
        t.next = head;
    }

    public void displayTickets() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customer + " " + temp.movie + " " + temp.seat);
            temp = temp.next;
        } while (temp != head);
    }

    public int countTickets() {
        if (head == null) return 0;
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

public class TicketCLL {
    public static void main(String[] args) {
        TicketCircularList tickets = new TicketCircularList();

        tickets.addTicket(1, "Adi", "Inception", "A1", "10:00");
        tickets.addTicket(2, "Rahul", "Avatar", "B2", "12:00");

        tickets.displayTickets();
        System.out.println("Total Tickets: " + tickets.countTickets());
    }
}
