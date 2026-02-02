class StudentNode {
    int roll;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int roll, String name, int age, String grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    private StudentNode head;

    // Add at end
    public void addStudent(int roll, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteStudent(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        StudentNode prev = head;
        StudentNode curr = head.next;

        while (curr != null && curr.roll != roll) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;
    }

    // Search
    public void searchStudent(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.name + " Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update Grade
    public void updateGrade(int roll, String newGrade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    // Display
    public void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentLL {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addStudent(1, "Adi", 20, "A");
        list.addStudent(2, "Rahul", 21, "B");
        list.addStudent(3, "Kiran", 22, "C");

        list.display();

        list.updateGrade(2, "A+");
        list.searchStudent(2);

        list.deleteStudent(1);
        list.display();
    }
}
