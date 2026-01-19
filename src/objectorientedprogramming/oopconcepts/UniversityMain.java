class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    Department(String name) {
        this.name = name;
    }
}

class University {
    Department dept;   // Composition
    Faculty faculty;   // Aggregation

    University() {
        dept = new Department("CSE");
        faculty = new Faculty("Dr. Adi");
    }

    void closeUniversity() {
        dept = null;
        System.out.println("University closed. Departments destroyed.");
        System.out.println("Faculty still exists: " + faculty.name);
    }
}

public class UniversityMain {
    public static void main(String[] args) {
        University u = new University();
        u.closeUniversity();
    }
}
