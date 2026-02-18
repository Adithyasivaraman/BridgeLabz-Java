class Student{ Student(){ System.out.println("Created"); } }

public class DynamicObjectCreation {
    public static void main(String[] args)throws Exception{
        Class.forName("Student").getConstructor().newInstance();
    }
}
