import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) {
        super(num, "Car", rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: ₹500";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) {
        super(num, "Bike", rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: ₹200";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) {
        super(num, "Truck", rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: ₹1000";
    }
}

public class VehicleRentals {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", 1000));
        vehicles.add(new Bike("B202", 300));
        vehicles.add(new Truck("T303", 2000));

        for (Vehicle v : vehicles) {
            System.out.println("Rental: " + v.calculateRentalCost(3));
            Insurable i = (Insurable) v;
            System.out.println(i.getInsuranceDetails());
        }
    }
}
