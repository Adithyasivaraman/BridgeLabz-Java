class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode prev, next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = this.next = null;
    }
}

class MovieDoublyLinkedList {
    private MovieNode head, tail;

    // Add at end
    public void addMovie(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove by Title
    public void removeMovie(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                System.out.println(temp.title + " (" + temp.rating + ")");
            temp = temp.next;
        }
    }

    // Display forward
    public void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director + " - " + temp.year + " - " + temp.rating);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director + " - " + temp.year + " - " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update rating
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }
}

public class MovieDLLMain {
    public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addMovie("Inception", "Nolan", 2010, 9.0);
        list.addMovie("Interstellar", "Nolan", 2014, 9.2);
        list.addMovie("Avatar", "Cameron", 2009, 8.5);

        list.displayForward();
        System.out.println("Reverse Order:");
        list.displayReverse();

        list.updateRating("Avatar", 9.0);
        list.searchByDirector("Nolan");

        list.removeMovie("Inception");
        list.displayForward();
    }
}
