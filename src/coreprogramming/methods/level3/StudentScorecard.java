import java.util.Scanner;
public class StudentScorecard {
    public static int[][] generatePCMScores(int students) {
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++) {
            pcm[i][0] = 10 + (int)(Math.random() * 90); // Physics
            pcm[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            pcm[i][2] = 10 + (int)(Math.random() * 90); // Maths
        }
        return pcm;
    }
    public static double[][] calculateResults(int[][] pcm) {
        double[][] results = new double[pcm.length][3];
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    public static void displayScorecard(int[][] pcm, double[][] results) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\t");
        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                    pcm[i][0] + "\t" +
                            pcm[i][1] + "\t" +
                            pcm[i][2] + "\t" +
                            results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2]
            );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int[][] pcm = generatePCMScores(students);
        double[][] results = calculateResults(pcm);
        displayScorecard(pcm, results);
    }
}
