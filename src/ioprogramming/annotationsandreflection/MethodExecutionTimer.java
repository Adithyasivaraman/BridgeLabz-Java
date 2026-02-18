import java.lang.reflect.*;

class Task{ public void run(){ for(int i=0;i<1e6;i++); } }

public class MethodExecutionTimer {
    public static void main(String[] args)throws Exception{
        Task t=new Task();
        Method m=Task.class.getMethod("run");
        long s=System.nanoTime();
        m.invoke(t);
        long e=System.nanoTime();
        System.out.println("Time:"+ (e-s));
    }
}
