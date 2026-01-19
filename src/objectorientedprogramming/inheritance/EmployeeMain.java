class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.language = language;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + language);
    }
}

class Intern extends Employee {
    int duration;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Manager("Adi", 1, 80000, 5);
        Employee e2 = new Developer("Rahul", 2, 60000, "Java");
        Employee e3 = new Intern("Kiran", 3, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
