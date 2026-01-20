import java.util.*;

class SearchIn2DSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int target = sc.nextInt();
        int left = 0, right = r * c - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / c;
            int col = mid % c;

            if (mat[row][col] == target) {
                System.out.println(true);
                return;
            } else if (mat[row][col] < target) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println(false);
    }
}
