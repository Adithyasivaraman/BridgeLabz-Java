interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food.");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving food.");
    }
}

public class Restaurants {
    public static void main(String[] args) {
        Worker w1 = new Chef("Adi", 101);
        Worker w2 = new Waiter("Rahul", 102);

        w1.performDuties();
        w2.performDuties();
    }
}
