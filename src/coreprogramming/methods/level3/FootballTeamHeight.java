public class FootballTeamHeight {
    public static int sum(int[] heights) {
        int total = 0;
        for (int h : heights) total += h;
        return total;
    }
    public static double mean(int[] heights) {
        return (double) sum(heights) / heights.length;
    }
    public static int shortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }
    public static int tallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);
        }
        System.out.println("Mean Height: " + mean(heights));
        System.out.println("Shortest Height: " + shortest(heights));
        System.out.println("Tallest Height: " + tallest(heights));
    }
}
