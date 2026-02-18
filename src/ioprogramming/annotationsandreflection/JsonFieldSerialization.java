import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField { String name(); }

class User {
    @JsonField(name="user_name")
    String name="Adi";
}

public class JsonFieldSerialization {
    public static void main(String[] args)throws Exception{
        User u=new User();
        for(Field f:u.getClass().getDeclaredFields()){
            JsonField j=f.getAnnotation(JsonField.class);
            System.out.println("{\""+j.name()+"\":\""+f.get(u)+"\"}");
        }
    }
}
