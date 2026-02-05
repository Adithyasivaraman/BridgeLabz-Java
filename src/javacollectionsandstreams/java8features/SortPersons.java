import java.util.*;

class Person {
    String name;
    int age;
    double salary;

    Person(String n,int a,double s){
        name=n; age=a; salary=s;
    }
}

public class SortPersons {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Adi",23,50000),
                new Person("Sam",30,60000),
                new Person("John",20,40000)
        );

        list.stream()
                .sorted((p1,p2)->p1.age-p2.age)
                .forEach(p->System.out.println(p.name+" "+p.age));
    }
}
