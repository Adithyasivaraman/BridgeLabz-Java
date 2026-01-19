class Employee {
    static String companyName = "Intellect Design Arena";
    private static int count = 0;

    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        count++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + count);
    }

    void print(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            System.out.println(e.name + " - " + e.designation + " - " + e.id);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Adi", 1, "Java Dev");
        e1.print(e1);
        displayTotalEmployees();
    }
}