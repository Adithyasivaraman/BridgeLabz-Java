import java.lang.reflect.*;
import java.util.*;

class User{ String name; int age; }

public class SimpleObjectMapper {
    static <T> T toObject(Class<T> c, Map<String,Object> map)throws Exception{
        T obj=c.getConstructor().newInstance();
        for(Field f:c.getDeclaredFields()){
            f.setAccessible(true);
            f.set(obj,map.get(f.getName()));
        }
        return obj;
    }
}
