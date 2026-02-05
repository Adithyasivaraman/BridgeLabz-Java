import java.util.*;
import java.util.stream.*;

class Claim {
    String claimId, policyNumber, status;
    double amount;

    Claim(String c,String p,double a,String s){
        claimId=c; policyNumber=p;
        amount=a; status=s;
    }
}

public class ClaimsAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("C1","P1",7000,"Approved"),
                new Claim("C2","P1",6000,"Approved"),
                new Claim("C3","P2",10000,"Approved"),
                new Claim("C4","P3",3000,"Rejected")
        );

        Map<String, DoubleSummaryStatistics> stats =
                claims.stream()
                        .filter(c -> c.status.equals("Approved")
                                && c.amount > 5000)
                        .collect(Collectors.groupingBy(
                                c -> c.policyNumber,
                                Collectors.summarizingDouble(c -> c.amount)
                        ));

        stats.entrySet().stream()
                .sorted((a,b)->Double.compare(
                        b.getValue().getSum(),
                        a.getValue().getSum()))
                .limit(3)
                .forEach(e ->
                        System.out.println(e.getKey() +
                                " Total=" + e.getValue().getSum() +
                                " Avg=" + e.getValue().getAverage()));
    }
}
