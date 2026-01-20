import java.util.*;

class PeakElementBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftOk = mid == 0 || arr[mid] > arr[mid - 1];
            boolean rightOk = mid == n - 1 || arr[mid] > arr[mid + 1];

            if (leftOk && rightOk) {
                System.out.println(arr[mid]);
                return;
            }
            if (mid > 0 && arr[mid - 1] > arr[mid]) right = mid - 1;
            else left = mid + 1;
        }
    }
}
