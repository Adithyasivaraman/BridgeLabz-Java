import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

class EmployeeSerialization {

    static void saveEmployees(List<Employee> list) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"));
        oos.writeObject(list);
        oos.close();
    }

    static List<Employee> loadEmployees() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"));
        List<Employee> list = (List<Employee>) ois.readObject();
        ois.close();
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Number of employees: ");
            int n = sc.nextInt();

            List<Employee> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int id = sc.nextInt();
                String name = sc.next();
                String dept = sc.next();
                double salary = sc.nextDouble();

                list.add(new Employee(id, name, dept, salary));
            }

            saveEmployees(list);

            System.out.println("Saved Employees:");
            for (Employee e : loadEmployees()) {
                System.out.println(e);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
