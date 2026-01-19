class Device {
    String deviceId;
    boolean status;

    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, boolean status, int temperature) {
        super(deviceId, status);
        this.temperatureSetting = temperature;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
        System.out.println("Temperature: " + temperatureSetting + "°C");
    }
}

public class SmartHomeMain {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("TH1001", true, 24);
        t.displayStatus();
    }
}
