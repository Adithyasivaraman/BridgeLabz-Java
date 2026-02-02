import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public double calculateBill() {
        return 5000;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("InPatient Records: " + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public double calculateBill() {
        return 1000;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("OutPatient Records: " + records);
    }
}

public class Hospitals {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(1, "Adi", 21));
        patients.add(new OutPatient(2, "Rahul", 30));

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
        }
    }
}
