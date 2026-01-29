import java.time.LocalDate;
import java.util.*;

class InsurancePolicyMapSystem {

    static class Policy {
        String policyNumber;
        String holderName;
        LocalDate expiryDate;
        String coverageType;
        double premium;

        Policy(String policyNumber, String holderName, LocalDate expiryDate, String coverageType, double premium) {
            this.policyNumber = policyNumber;
            this.holderName = holderName;
            this.expiryDate = expiryDate;
            this.coverageType = coverageType;
            this.premium = premium;
        }

        public String toString() {
            return policyNumber + " | " + holderName + " | " + coverageType + " | " + expiryDate + " | " + premium;
        }
    }

    static Map<String, Policy> hashMap = new HashMap<>();
    static Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    static TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    static void addPolicy(Policy p) {
        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);
        treeMap.computeIfAbsent(p.expiryDate, k -> new ArrayList<>()).add(p);
    }

    static Policy getPolicyByNumber(String number) {
        return hashMap.get(number);
    }

    static List<Policy> getPoliciesExpiringIn30Days() {
        List<Policy> result = new ArrayList<>();
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);
        for (Map.Entry<LocalDate, List<Policy>> e : treeMap.subMap(now, true, limit, true).entrySet()) {
            result.addAll(e.getValue());
        }
        return result;
    }

    static List<Policy> getPoliciesByHolder(String name) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : hashMap.values()) {
            if (p.holderName.equalsIgnoreCase(name)) result.add(p);
        }
        return result;
    }

    static void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<String, Policy>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Policy p = it.next().getValue();
            if (p.expiryDate.isBefore(today)) {
                it.remove();
                linkedHashMap.remove(p.policyNumber);
                List<Policy> list = treeMap.get(p.expiryDate);
                list.remove(p);
                if (list.isEmpty()) treeMap.remove(p.expiryDate);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Policy");
            System.out.println("2.Get Policy by Number");
            System.out.println("3.Policies Expiring in 30 Days");
            System.out.println("4.Policies by Holder Name");
            System.out.println("5.Remove Expired Policies");
            System.out.println("6.Show All (Insertion Order)");
            System.out.println("7.Show All (Sorted by Expiry)");
            System.out.println("0.Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Policy Number: ");
                    String num = sc.next();
                    System.out.print("Holder Name: ");
                    String name = sc.next();
                    System.out.print("Expiry Date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(sc.next());
                    System.out.print("Coverage Type: ");
                    String type = sc.next();
                    System.out.print("Premium: ");
                    double premium = sc.nextDouble();

                    addPolicy(new Policy(num, name, date, type, premium));
                    System.out.println("Policy Added");
                    break;

                case 2:
                    System.out.print("Enter Policy Number: ");
                    String search = sc.next();
                    System.out.println(getPolicyByNumber(search));
                    break;

                case 3:
                    for (Policy p : getPoliciesExpiringIn30Days()) System.out.println(p);
                    break;

                case 4:
                    System.out.print("Enter Holder Name: ");
                    String holder = sc.next();
                    for (Policy p : getPoliciesByHolder(holder)) System.out.println(p);
                    break;

                case 5:
                    removeExpiredPolicies();
                    System.out.println("Expired Policies Removed");
                    break;

                case 6:
                    for (Policy p : linkedHashMap.values()) System.out.println(p);
                    break;

                case 7:
                    for (Map.Entry<LocalDate, List<Policy>> e : treeMap.entrySet())
                        for (Policy p : e.getValue()) System.out.println(p);
                    break;

                case 0:
                    return;
            }
        }
    }
}
