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

// Selection Sort (for correct swap count)
for (int i = 0; i < n - 1; i++) {
    int minIndex = i;

    for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }

    if (minIndex != i) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        swaps++;
    }
}

// Print sorted array
for (int i = 0; i < n; i++) {
    System.out.print(arr[i]);
    if (i < n - 1) System.out.print(" ");
}
System.out.println();

// Print swap count
System.out.println("Swaps: " + swaps);

        // TODO: Read n integers into an array
        //       Implement BUBBLE SORT manually (no Arrays.sort)
        //       Print sorted array ascending, space-separated
        //       Then print: "Swaps: X" where X = total number of swaps performed
        //
        // Input:
        // 5
        // 64 34 25 12 22
        //
        // Output:
        // 12 22 25 34 64
        // Swaps: 7

    }
}
