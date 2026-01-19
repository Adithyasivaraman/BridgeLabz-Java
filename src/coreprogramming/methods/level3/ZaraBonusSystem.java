public class ZaraBonusSystem {
    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];
        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // salary
            data[i][1] = 1 + (int)(Math.random() * 10);       // years of service
        }
        return data;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }
        return result;
    }
    public static void printSummary(double[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < data.length; i++) {
            totalOld += data[i][0];
            totalBonus += result[i][0];
            totalNew += result[i][1];
            System.out.println(
                    data[i][0] + "\t" +
                            data[i][1] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1]);
        }
        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        printSummary(employeeData, bonusData);
    }
}
