class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Person in School");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Teacher - Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Student - Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Staff - Department: " + department);
    }
}

public class SchoolRoleMain {
    public static void main(String[] args) {
        Person p1 = new Teacher("Mr. Kumar", 40, "Maths");
        Person p2 = new Student("Adi", 20, "A");
        Person p3 = new Staff("Ravi", 35, "Administration");

        p1.displayRole();
        p2.displayRole();
        p3.displayRole();
    }
}
