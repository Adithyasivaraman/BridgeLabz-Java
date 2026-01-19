class Patient {
    static String hospitalName = "Apollo";
    private static int totalPatients = 0;

    final int patientID;
    String name, ailment;
    int age;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println(p.name + " - " + p.age + " - " + p.ailment + " - " + p.patientID);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Adi", 20, "Code Fever", 1001);
        p1.display(p1);
        getTotalPatients();
    }
}