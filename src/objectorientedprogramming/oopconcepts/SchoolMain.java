import java.util.*;

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.students.add(this);
    }

    void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses)
            System.out.println(c.courseName);
    }
}

class Course {
    String courseName;
    List<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students)
            System.out.println(s.name);
    }
}

class School {
    List<Student> students = new ArrayList<>();
    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolMain {
    public static void main(String[] args) {
        Student s1 = new Student("Adi");
        Course c1 = new Course("Java");
        Course c2 = new Course("DSA");

        s1.enroll(c1);
        s1.enroll(c2);

        s1.viewCourses();
        c1.showStudents();
    }
}
