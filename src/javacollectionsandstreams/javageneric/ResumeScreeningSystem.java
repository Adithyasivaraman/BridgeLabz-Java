import java.util.*;

abstract class JobRole {
    private String title;

    JobRole(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T role;

    Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    String getCandidateName() {
        return candidateName;
    }

    T getRole() {
        return role;
    }
}

public class ResumeScreeningSystem {

    static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> r : resumes) {
            System.out.println(r.getCandidateName() + " applying for " + r.getRole().getTitle());
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Adi", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Rahul", new DataScientist());
        Resume<ProductManager> r3 = new Resume<>("Neha", new ProductManager());

        List<Resume<? extends JobRole>> allResumes = new ArrayList<>();
        allResumes.add(r1);
        allResumes.add(r2);
        allResumes.add(r3);

        screenResumes(allResumes);
    }
}
