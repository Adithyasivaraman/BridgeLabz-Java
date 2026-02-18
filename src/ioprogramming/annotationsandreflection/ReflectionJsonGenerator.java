import java.lang.reflect.*;

class User{ String name="Adi"; int age=21; }

public class ReflectionJsonGenerator {
    public static void main(String[] args)throws Exception{
        User u=new User();
        StringBuilder sb=new StringBuilder("{");
        for(Field f:u.getClass().getDeclaredFields()){
            f.setAccessible(true);
            sb.append("\""+f.getName()+"\":\""+f.get(u)+"\",");
        }
        System.out.println(sb.append("}"));
    }
}
