import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return new Random().nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println(guess);
            String feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("correct")) break;
            if (feedback.equalsIgnoreCase("high")) high = guess - 1;
            if (feedback.equalsIgnoreCase("low")) low = guess + 1;
        }
    }
}
