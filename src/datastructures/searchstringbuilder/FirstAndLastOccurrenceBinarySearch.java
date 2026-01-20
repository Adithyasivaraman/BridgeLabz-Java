import java.util.*;

class FirstAndLastOccurrenceBinarySearch {
    static int first(int[] arr, int x) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                ans = m;
                r = m - 1;
            } else if (arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return ans;
    }

    static int last(int[] arr, int x) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                ans = m;
                l = m + 1;
            } else if (arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(first(arr, x) + " " + last(arr, x));
    }
}
