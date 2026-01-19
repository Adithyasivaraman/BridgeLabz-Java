class Vehicle {
    static double registrationFee = 5000;

    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void show(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println(v.ownerName + " - " + v.vehicleType + " - " + v.registrationNumber);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Adi", "Bike", "TN01AB1234");
        v1.show(v1);
    }
}