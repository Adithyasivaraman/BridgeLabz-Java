import java.util.Scanner;
public class FriendsStatsMethod {
    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int a : ages) if (a < min) min = a;
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        System.out.println("Youngest = " + findYoungest(age));
        System.out.println("Tallest = " + findTallest(height));
    }
}
