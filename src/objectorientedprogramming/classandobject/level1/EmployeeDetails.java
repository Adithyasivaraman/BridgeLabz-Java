import java.util.Scanner;

public class EmployeeDetails {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDetails e = new EmployeeDetails();
        e.name = sc.nextLine();
        e.id = sc.nextInt();
        e.salary = sc.nextDouble();
        e.display();
    }
}
