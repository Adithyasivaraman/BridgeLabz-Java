import java.util.Scanner;

public class TemperatureConverter {

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        String type = sc.next();

        System.out.println(
                type.equalsIgnoreCase("C")
                        ? celsiusToFahrenheit(value)
                        : fahrenheitToCelsius(value)
        );
    }
}
