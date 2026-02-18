import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Engine{}
class Car{
    @Inject Engine engine;
}

public class SimpleDIContainer {
    public static void main(String[] args)throws Exception{
        Car car=new Car();
        for(Field f:Car.class.getDeclaredFields()){
            if(f.isAnnotationPresent(Inject.class)){
                f.setAccessible(true);
                f.set(car,new Engine());
            }
        }
        System.out.println("Dependency injected");
    }
}
