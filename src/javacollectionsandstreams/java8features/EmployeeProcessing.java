import java.util.*;
import java.util.stream.*;

class Employee {
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
}

public class EmployeeProcessing {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Adi","Engineering",90000),
                new Employee(2,"Sam","Engineering",75000),
                new Employee(3,"John","Engineering",120000),
                new Employee(4,"Riya","HR",85000)
        );

        Map<String, Double> result =
                employees.stream()
                        .filter(e -> e.department.equals("Engineering")
                                && e.salary > 80000)
                        .sorted((a,b)->Double.compare(b.salary,a.salary))
                        .collect(Collectors.groupingBy(
                                e -> e.department,
                                Collectors.averagingDouble(e -> e.salary)
                        ));

        System.out.println(result);
    }
}
