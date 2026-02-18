import java.lang.reflect.*;

public class ClassInfoReflection {
    public static void main(String[] args)throws Exception{
        Class<?> c=Class.forName("java.util.ArrayList");
        for(Method m:c.getDeclaredMethods())
            System.out.println(m.getName());
    }
}
