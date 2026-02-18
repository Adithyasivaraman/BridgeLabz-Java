import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class Worker {
    @LogExecutionTime
    void work(){
        long s=System.nanoTime();
        for(int i=0;i<1e6;i++);
        long e=System.nanoTime();
        System.out.println("Time:"+(e-s));
    }
}

public class LogExecutionTimeExample {
    public static void main(String[] args){
        new Worker().work();
    }
}
