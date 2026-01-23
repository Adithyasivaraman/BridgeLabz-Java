import java.util.*;

class DataStructureSearchBenchmark {

    static boolean arraySearch(int[] arr, int target) {
        for (int x : arr) {
            if (x == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long startArray = System.nanoTime();
        boolean a = arraySearch(arr, target);
        long endArray = System.nanoTime();

        long startHash = System.nanoTime();
        boolean h = hashSet.contains(target);
        long endHash = System.nanoTime();

        long startTree = System.nanoTime();
        boolean t = treeSet.contains(target);
        long endTree = System.nanoTime();

        System.out.println("Array Found: " + a);
        System.out.println("Array Search Time: " + (endArray - startArray) + " ns");

        System.out.println("HashSet Found: " + h);
        System.out.println("HashSet Search Time: " + (endHash - startHash) + " ns");

        System.out.println("TreeSet Found: " + t);
        System.out.println("TreeSet Search Time: " + (endTree - startTree) + " ns");
    }
}
