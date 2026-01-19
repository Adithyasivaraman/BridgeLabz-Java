import java.util.Scanner;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName);
        System.out.println(vehicleType);
        System.out.println(registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        updateRegistrationFee(sc.nextDouble());
        sc.nextLine();
        Vehicle v = new Vehicle(sc.nextLine(), sc.nextLine());
        v.displayVehicleDetails();
    }
}
