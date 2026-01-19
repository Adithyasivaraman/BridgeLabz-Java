class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

class CircularTour {
    public static int findStart(PetrolPump[] arr) {
        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < arr.length; i++) {
            surplus += arr[i].petrol - arr[i].distance;
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }
}

public class CircularTourMain {
    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        int start = CircularTour.findStart(pumps);
        System.out.println("Start at petrol pump: " + start);
    }
}
