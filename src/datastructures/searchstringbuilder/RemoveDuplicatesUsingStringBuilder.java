import java.util.*;

class RemoveDuplicatesUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
