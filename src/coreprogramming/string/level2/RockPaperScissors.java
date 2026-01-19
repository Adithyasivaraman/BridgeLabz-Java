import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors")) ||
                (user.equals("paper") && computer.equals("rock")) ||
                (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent);

        return stats;
    }

    public static void displayResults(String[][] games, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            games[i][0] + "\t" +
                            games[i][1] + "\t\t" +
                            games[i][2]
            );
        }

        System.out.println("\nPlayer\tWins\tWin Percentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t" +
                            stats[i][1] + "\t" +
                            stats[i][2] + "%"
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gamesCount = sc.nextInt();
        String[][] games = new String[gamesCount][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < gamesCount; i++) {
            String userChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                compWins++;
            }

            games[i][0] = userChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, gamesCount);
        displayResults(games, stats);

        sc.close();
    }
}
