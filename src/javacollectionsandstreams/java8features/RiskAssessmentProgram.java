import java.util.*;
import java.util.stream.*;

class PolicyHolder {
    int holderId, age;
    String name, policyType;
    double premium;

    PolicyHolder(int id,String n,int a,String t,double p){
        holderId=id; name=n; age=a;
        policyType=t; premium=p;
    }
}

class RiskAssessment {
    int id;
    String name;
    double score;

    RiskAssessment(int i,String n,double s){
        id=i; name=n; score=s;
    }
}

public class RiskAssessmentProgram {
    public static void main(String[] args) {

        List<PolicyHolder> holders = Arrays.asList(
                new PolicyHolder(1,"A",65,"Life",400),
                new PolicyHolder(2,"B",70,"Life",300),
                new PolicyHolder(3,"C",50,"Life",600)
        );

        Map<String,List<RiskAssessment>> grouped =
                holders.stream()
                        .filter(h -> h.policyType.equals("Life")
                                && h.age > 60)
                        .map(h -> new RiskAssessment(
                                h.holderId,
                                h.name,
                                h.premium/(double)h.age))
                        .sorted((a,b)->Double.compare(b.score,a.score))
                        .collect(Collectors.groupingBy(
                                r -> r.score > 0.5 ?
                                        "High Risk" : "Low Risk"
                        ));

        System.out.println(grouped);
    }
}
