import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 50 + (int)(Math.random() * 51);
            scores[i][1] = 50 + (int)(Math.random() * 51);
            scores[i][2] = 50 + (int)(Math.random() * 51);
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] result = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
            result[i][3] = 0;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 90) grades[i] = "A";
            else if (p >= 80) grades[i] = "B";
            else if (p >= 70) grades[i] = "C";
            else if (p >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScoreCard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            (int)stats[i][0] + "\t" +
                            stats[i][1] + "\t" +
                            stats[i][2] + "\t" +
                            grades[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);

        displayScoreCard(scores, stats, grades);

        sc.close();
    }
}
