import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority="HIGH", assignedTo="Adi")
    void task() {}
}

public class TaskInfoExample {
    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getMethod("task");
        TaskInfo t = m.getAnnotation(TaskInfo.class);
        System.out.println(t.priority()+" "+t.assignedTo());
    }
}
