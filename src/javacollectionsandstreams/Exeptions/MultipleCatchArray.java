import java.util.*;

class MultipleCatchArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] arr = null;

            if (n > 0) {
                arr = new int[n];
                System.out.println("Enter elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
