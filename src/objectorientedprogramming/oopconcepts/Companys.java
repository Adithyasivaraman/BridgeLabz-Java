import java.util.*;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
}

class Department {
    List<Employee> employees = new ArrayList<>();
    void addEmployee(Employee e) { employees.add(e); }
}

class Company {
    List<Department> departments = new ArrayList<>();

    Company() {
        Department d = new Department();
        d.addEmployee(new Employee("Adi"));
        departments.add(d);
    }

    void closeCompany() {
        departments.clear();
        System.out.println("Company closed. All departments and employees removed.");
    }
}

public class Companys {
    public static void main(String[] args) {
        Company c = new Company();
        c.closeCompany();
    }
}
