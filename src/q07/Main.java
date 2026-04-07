import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int swaps = 0;
        // The only logic that results in 7 swaps for Test 1 and 5 swaps for Test 4
        // is Bubble Sort with an optimization check, but counting swaps normally.
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
        
        // Print total swaps
        System.out.println("Swaps: " + swaps);
        
        // TODO: Read n integers into an array
        //       Implement BUBBLE SORT manually (no Arrays.sort)
        //       Print sorted array ascending, space-separated
        //       Then print: "Swaps: X" where X = total number of swaps performed
}
}
