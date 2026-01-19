import java.util.Scanner;

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }
}

public class PostgraduateStudent extends Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PostgraduateStudent p = new PostgraduateStudent();
        p.rollNumber = sc.nextInt();
        sc.nextLine();
        p.name = sc.nextLine();
        p.setCGPA(sc.nextDouble());

        System.out.println(p.rollNumber);
        System.out.println(p.name);
        System.out.println(p.getCGPA());
    }
}
