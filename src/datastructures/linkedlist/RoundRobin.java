class ProcessNode {
    int pid, burst;
    ProcessNode next;

    ProcessNode(int pid, int burst) {
        this.pid = pid;
        this.burst = burst;
    }
}

class RoundRobinScheduler {
    private ProcessNode head = null;

    public void addProcess(int pid, int burst) {
        ProcessNode p = new ProcessNode(pid, burst);
        if (head == null) {
            head = p;
            p.next = head;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = p;
        p.next = head;
    }

    public void simulate(int quantum) {
        ProcessNode curr = head;
        System.out.println("Round Robin Execution:");
        while (true) {
            if (curr.burst > 0) {
                int exec = Math.min(curr.burst, quantum);
                curr.burst -= exec;
                System.out.println("Process " + curr.pid + " executed for " + exec + " units");
            }
            curr = curr.next;

            boolean done = true;
            ProcessNode temp = head;
            do {
                if (temp.burst > 0) {
                    done = false;
                    break;
                }
                temp = temp.next;
            } while (temp != head);

            if (done) break;
        }
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.addProcess(3, 8);

        rr.simulate(3);
    }
}
