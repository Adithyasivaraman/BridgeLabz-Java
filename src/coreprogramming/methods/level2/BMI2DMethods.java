import java.util.Scanner;
public class BMI2DMethods {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double h = data[i][1] / 100;
            data[i][2] = data[i][0] / (h * h);
        }
    }
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][1] + " " + data[i][0] + " " +
                    data[i][2] + " " + getStatus(data[i][2]));
        }
    }
}
