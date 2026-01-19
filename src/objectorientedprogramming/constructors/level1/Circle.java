import java.util.Scanner;

public class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        Circle c2 = new Circle(sc.nextDouble());
        System.out.println(c1.area());
        System.out.println(c2.area());
    }
}
