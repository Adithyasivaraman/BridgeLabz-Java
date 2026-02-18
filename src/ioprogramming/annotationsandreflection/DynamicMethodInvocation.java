import java.lang.reflect.*;

class MathOps{
    public int add(int a,int b){ return a+b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args)throws Exception{
        MathOps m=new MathOps();
        Method md=MathOps.class.getMethod("add",int.class,int.class);
        System.out.println(md.invoke(m,2,3));
    }
}
