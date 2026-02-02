class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Speed: " + maxSpeed + ", Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int speed, String fuel, int seats) {
        super(speed, fuel);
        this.seatCapacity = seats;
    }

    @Override
    void displayInfo() {
        System.out.println("Car - Seats: " + seatCapacity + ", Speed: " + maxSpeed);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int speed, String fuel, int load) {
        super(speed, fuel);
        this.loadCapacity = load;
    }

    @Override
    void displayInfo() {
        System.out.println("Truck - Load: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasCarrier;

    Motorcycle(int speed, String fuel, boolean hasCarrier) {
        super(speed, fuel);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle - Carrier: " + hasCarrier);
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 10),
                new Motorcycle(150, "Petrol", true)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
