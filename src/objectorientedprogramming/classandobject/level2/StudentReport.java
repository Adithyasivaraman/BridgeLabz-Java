import java.util.Scanner;

public class StudentReport {
    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        return "D";
    }

    void display() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
        System.out.println(calculateGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentReport s = new StudentReport();
        s.name = sc.nextLine();
        s.rollNumber = sc.nextInt();
        s.marks = sc.nextInt();
        s.display();
    }
}
