import java.util.Scanner;

public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName);
        System.out.println(duration);
        System.out.println(fee);
        System.out.println(instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        updateInstituteName(sc.nextLine());
        Course c = new Course(sc.nextLine(), sc.nextInt(), sc.nextDouble());
        c.displayCourseDetails();
    }
}
