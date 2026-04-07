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

//  Copy array for sorting
int[] tempArr = Arrays.copyOf(arr, n);

//  Count swaps (inversion count using simple method)
int swaps = 0;
for (int i = 0; i < n; i++) {
    for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
            swaps++;
        }
    }
}

//  Bubble Sort (only for sorting, not counting)
for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (tempArr[j] > tempArr[j + 1]) {
            int t = tempArr[j];
            tempArr[j] = tempArr[j + 1];
            tempArr[j + 1] = t;
        }
    }
}

// Print sorted array
for (int i = 0; i < n; i++) {
    System.out.print(tempArr[i]);
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
