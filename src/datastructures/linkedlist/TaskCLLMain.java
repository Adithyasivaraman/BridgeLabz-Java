class TaskNode {
    int id;
    String name;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskCircularList {
    private TaskNode head = null;

    public void addTask(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    public void removeTask(int id) {
        if (head == null) return;

        TaskNode curr = head, prev = null;
        do {
            if (curr.id == id) {
                if (prev != null)
                    prev.next = curr.next;
                else {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = curr.next;
                    last.next = head;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void displayTasks() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskCLLMain {
    public static void main(String[] args) {
        TaskCircularList scheduler = new TaskCircularList();

        scheduler.addTask(1, "Coding", 1, "20-Jan");
        scheduler.addTask(2, "Exam", 2, "25-Jan");
        scheduler.addTask(3, "Project", 1, "30-Jan");

        scheduler.displayTasks();
        scheduler.removeTask(2);
        System.out.println("After removal:");
        scheduler.displayTasks();
    }
}
