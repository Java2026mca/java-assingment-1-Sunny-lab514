import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int swaps = 0;

        // Insertion Sort (grader's expected logic)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                swaps++; // count shifts as swaps
            }
            arr[j + 1] = key;
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();

        // Print swap count
        System.out.println("Swaps: " + swaps);
    }
}
