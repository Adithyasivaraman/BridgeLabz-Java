import java.util.*;

class UserAlreadyExistsException extends Exception {
    UserAlreadyExistsException(String msg) {
        super(msg);
    }
}

class UserNotFoundException extends Exception {
    UserNotFoundException(String msg) {
        super(msg);
    }
}

class UserService {

    private Set<String> users = new HashSet<>();

    void registerUser(String username)
            throws UserAlreadyExistsException {
        if (users.contains(username)) {
            throw new UserAlreadyExistsException("User already exists");
        }
        users.add(username);
        System.out.println("User registered: " + username);
    }

    void checkUserExistence(String username)
            throws UserNotFoundException {
        if (!users.contains(username)) {
            throw new UserNotFoundException("User not found");
        }
        System.out.println("User exists: " + username);
    }
}

class UserServiceDemo {

    public static void main(String[] args) {
        UserService service = new UserService();

        try {
            service.registerUser("adi");
            service.registerUser("adi");
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            service.checkUserExistence("john");
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
