import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {
        int min = 10, max = 18;
        int[] count = new int[max - min + 1];

        for (int age : arr)
            count[age - min]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 11, 15, 13};
        countingSort(ages);
        System.out.println(Arrays.toString(ages));
    }
}
