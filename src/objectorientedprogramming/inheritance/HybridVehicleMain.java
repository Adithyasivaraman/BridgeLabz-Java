interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled with petrol.");
    }
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging its battery.");
    }
}

public class HybridVehicleMain {
    public static void main(String[] args) {
        PetrolVehicle p = new PetrolVehicle("Honda City", 180);
        ElectricVehicle e = new ElectricVehicle("Tesla Model 3", 220);

        p.refuel();
        e.charge();
    }
}
