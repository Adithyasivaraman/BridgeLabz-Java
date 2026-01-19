import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class Manager extends Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();
        m.employeeID = sc.nextInt();
        sc.nextLine();
        m.department = sc.nextLine();
        m.setSalary(sc.nextDouble());

        System.out.println(m.employeeID);
        System.out.println(m.department);
        System.out.println(m.getSalary());
    }
}