import java.util.*;

class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}

class Course {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
    }
}

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        c.students.add(this);
        System.out.println(name + " enrolled in " + c.name);
    }
}

public class UniversityManagementMain {
    public static void main(String[] args) {
        Student s = new Student("Adi");
        Professor p = new Professor("Dr. Kumar");
        Course c = new Course("Java");

        c.assignProfessor(p);
        s.enrollCourse(c);

        System.out.println("Professor for " + c.name + ": " + c.professor.name);
    }
}
