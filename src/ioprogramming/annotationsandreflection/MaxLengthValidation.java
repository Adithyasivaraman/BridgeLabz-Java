import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength { int value(); }

class User {
    @MaxLength(5)
    String username;

    User(String name) throws Exception {
        Field f=getClass().getDeclaredField("username");
        MaxLength m=f.getAnnotation(MaxLength.class);
        if(name.length()>m.value())
            throw new IllegalArgumentException("Too long");
        username=name;
    }
}

public class MaxLengthValidation {
    public static void main(String[] args) throws Exception {
        new User("Adi");
    }
}
