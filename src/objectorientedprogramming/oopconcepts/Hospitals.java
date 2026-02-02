class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Dr. " + name + " is consulting " + p.name);
    }
}

class Hospital {
    String name;
    Hospital(String name) {
        this.name = name;
    }
}

public class Hospitals {
    public static void main(String[] args) {
        Doctor d = new Doctor("Adi");
        Patient p = new Patient("Rahul");

        d.consult(p);
    }
}
