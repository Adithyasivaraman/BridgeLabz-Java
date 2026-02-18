import java.lang.reflect.*;

class Config{ private static String API_KEY="OLD"; }

public class ModifyStaticField {
    public static void main(String[] args)throws Exception{
        Field f=Config.class.getDeclaredField("API_KEY");
        f.setAccessible(true);
        f.set(null,"NEWKEY");
        System.out.println(f.get(null));
    }
}
