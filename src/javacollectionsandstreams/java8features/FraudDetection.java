import java.util.*;
import java.util.stream.*;

class Transaction {
    String id, policy;
    double amount;
    boolean fraud;

    Transaction(String i,String p,double a,boolean f){
        id=i; policy=p; amount=a; fraud=f;
    }
}

public class FraudDetection {
    public static void main(String[] args) {

        List<Transaction> list = Arrays.asList(
                new Transaction("T1","P1",15000,true),
                new Transaction("T2","P1",12000,true),
                new Transaction("T3","P1",14000,true),
                new Transaction("T4","P1",16000,true),
                new Transaction("T5","P1",13000,true),
                new Transaction("T6","P1",17000,true),
                new Transaction("T7","P2",2000,false)
        );

        Map<String, DoubleSummaryStatistics> grouped =
                list.stream()
                        .filter(t -> t.fraud && t.amount > 10000)
                        .collect(Collectors.groupingBy(
                                t -> t.policy,
                                Collectors.summarizingDouble(t -> t.amount)
                        ));

        grouped.forEach((policy, stats) -> {
            if(stats.getCount() > 5 ||
                    stats.getSum() > 50000) {
                System.out.println("ALERT: "+policy);
            }
        });
    }
}
