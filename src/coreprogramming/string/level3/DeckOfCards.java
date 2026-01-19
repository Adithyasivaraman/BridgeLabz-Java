import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[idx++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) return null;

        String[][] result = new String[players][cards];
        int idx = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                result[i][j] = deck[idx++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] deck = initializeDeck(suits, ranks);
        shuffleDeck(deck);

        String[][] distributed = distribute(deck, players, cards);

        if (distributed == null) {
            System.out.println("Cannot distribute cards");
            return;
        }

        for (int i = 0; i < distributed.length; i++) {
            System.out.println("Player " + (i + 1));
            for (String card : distributed[i]) {
                System.out.println(card);
            }
        }
    }
}