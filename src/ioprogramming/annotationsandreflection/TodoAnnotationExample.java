import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task="Add login", assignedTo="Adi")
    void login(){}
}

public class TodoAnnotationExample {
    public static void main(String[] args){
        for(Method m:Project.class.getDeclaredMethods()){
            Todo t=m.getAnnotation(Todo.class);
            if(t!=null)
                System.out.println(t.task()+" "+t.assignedTo());
        }
    }
}
