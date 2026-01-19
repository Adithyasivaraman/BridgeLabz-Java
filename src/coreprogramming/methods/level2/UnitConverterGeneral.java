import java.util.Scanner;
public class UnitConverterGeneral {
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        double celsius = sc.nextDouble();
        double pounds = sc.nextDouble();
        double kilograms = sc.nextDouble();
        double gallons = sc.nextDouble();
        double liters = sc.nextDouble();
        System.out.println(convertFahrenheitToCelsius(fahrenheit));
        System.out.println(convertCelsiusToFahrenheit(celsius));
        System.out.println(convertPoundsToKg(pounds));
        System.out.println(convertKgToPounds(kilograms));
        System.out.println(convertGallonsToLiters(gallons));
        System.out.println(convertLitersToGallons(liters));
    }
}
