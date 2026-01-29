import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

class GroupByDepartment {

    static Map<String, List<Employee>> groupByDept(List<Employee> employees) {
        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {
            map.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);
        }

        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String dept = sc.next();
            list.add(new Employee(name, dept));
        }

        Map<String, List<Employee>> grouped = groupByDept(list);

        for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Employee e : entry.getValue()) {
                System.out.print(e.name + " ");
            }
            System.out.println();
        }
    }
}
