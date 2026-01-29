import java.util.*;

class VotingSystem {

    static HashMap<String, Integer> voteMap = new HashMap<>();
    static LinkedHashMap<String, Integer> insertionOrderMap = new LinkedHashMap<>();

    static void addVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        insertionOrderMap.put(candidate, voteMap.get(candidate));
    }

    static void showVotesInsertionOrder() {
        for (Map.Entry<String, Integer> e : insertionOrderMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    static void showVotesSorted() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);
        for (Map.Entry<String, Integer> e : sortedMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    static void showWinner() {
        String winner = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> e : voteMap.entrySet()) {
            if (e.getValue() > maxVotes) {
                maxVotes = e.getValue();
                winner = e.getKey();
            }
        }

        if (winner != null)
            System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
        else
            System.out.println("No votes yet");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Cast Vote");
            System.out.println("2.Show Votes (Insertion Order)");
            System.out.println("3.Show Votes (Sorted Order)");
            System.out.println("4.Show Winner");
            System.out.println("0.Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Candidate Name: ");
                    String name = sc.next();
                    addVote(name);
                    System.out.println("Vote recorded");
                    break;

                case 2:
                    showVotesInsertionOrder();
                    break;

                case 3:
                    showVotesSorted();
                    break;

                case 4:
                    showWinner();
                    break;

                case 0:
                    return;
            }
        }
    }
}
