import java.util.*;

public class CacheResultExample {
    static Map<Integer,Integer> cache=new HashMap<>();

    static int fib(int n){
        if(cache.containsKey(n)) return cache.get(n);
        int r=(n<=1)?n:fib(n-1)+fib(n-2);
        cache.put(n,r);
        return r;
    }

    public static void main(String[] args){
        System.out.println(fib(40));
    }
}
