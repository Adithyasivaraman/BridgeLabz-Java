import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed { String value(); }

@RoleAllowed("ADMIN")
class AdminService {
    void delete(){ System.out.println("Deleted"); }
}

public class RoleAllowedExample {
    public static void main(String[] args){
        String role="USER";
        RoleAllowed r=AdminService.class.getAnnotation(RoleAllowed.class);
        if(r.value().equals(role))
            new AdminService().delete();
        else
            System.out.println("Access Denied!");
    }
}
