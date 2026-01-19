class Student {
    static String universityName = "Anna University";
    private static int total = 0;

    final int rollNumber;
    String name, grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        total++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + total);
    }

    void operate(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println(s.name + " - " + s.rollNumber + " - " + s.grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Adi", 22, "A+");
        s1.operate(s1);
        displayTotalStudents();
    }
}