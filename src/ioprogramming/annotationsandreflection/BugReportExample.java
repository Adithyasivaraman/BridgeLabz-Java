import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Bugs.class)
@interface BugReport { String description(); }

@Retention(RetentionPolicy.RUNTIME)
@interface Bugs { BugReport[] value(); }

class TestModule {
    @BugReport(description="Null issue")
    @BugReport(description="Memory leak")
    void run() {}
}

public class BugReportExample {
    public static void main(String[] args) throws Exception {
        Method m = TestModule.class.getMethod("run");
        for (BugReport b : m.getAnnotationsByType(BugReport.class))
            System.out.println(b.description());
    }
}
