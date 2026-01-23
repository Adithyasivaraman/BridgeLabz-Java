import java.util.*;

class LinearVsBinarySearch {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int target = sc.nextInt();

        long startLinear = System.nanoTime();
        int linearIndex = linearSearch(arr, target);
        long endLinear = System.nanoTime();

        Arrays.sort(arr);

        long startBinary = System.nanoTime();
        int binaryIndex = binarySearch(arr, target);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search Index: " + linearIndex);
        System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");

        System.out.println("Binary Search Index (after sorting): " + binaryIndex);
        System.out.println("Binary Search Time: " + (endBinary - startBinary) + " ns");
    }
}
