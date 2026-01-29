import java.util.*;

abstract class CourseType {
    private String name;

    CourseType(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) {
        super(name);
    }
}

class Course<T extends CourseType> {
    private T courseType;

    Course(T courseType) {
        this.courseType = courseType;
    }

    T getCourseType() {
        return courseType;
    }
}

public class UniversityCourseSystem {

    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getName());
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> java = new Course<>(new AssignmentCourse("Java Programming"));
        Course<ResearchCourse> ai = new Course<>(new ResearchCourse("AI Research"));

        List<ExamCourse> examCourses = Arrays.asList(math.getCourseType());
        List<AssignmentCourse> assignmentCourses = Arrays.asList(java.getCourseType());
        List<ResearchCourse> researchCourses = Arrays.asList(ai.getCourseType());

        displayCourses(examCourses);
        displayCourses(assignmentCourses);
        displayCourses(researchCourses);
    }
}
