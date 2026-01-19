import java.util.Scanner;
public class StudentGradesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] percent = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            if (p < 0 || c < 0 || m < 0) {
                i--;
                continue;
            }
            percent[i] = (p + c + m) / 3.0;
            if (percent[i] >= 80) grade[i] = "A";
            else if (percent[i] >= 70) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else if (percent[i] >= 50) grade[i] = "D";
            else if (percent[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + " " + grade[i]);
        }
    }
}
