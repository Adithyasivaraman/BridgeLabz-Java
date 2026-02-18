import java.lang.reflect.*;

interface Greeting{ void sayHello(); }

class GreetingImpl implements Greeting{
    public void sayHello(){ System.out.println("Hello"); }
}

public class LoggingProxyExample {
    public static void main(String[] args){
        Greeting proxy=(Greeting)Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                (p,m,a)->{System.out.println("Calling "+m.getName());
                    return m.invoke(new GreetingImpl(),a);}
        );
        proxy.sayHello();
    }
}
