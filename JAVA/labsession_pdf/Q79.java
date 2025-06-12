import java.util.*;
public class Q79 {
    // Method to find the number of longest increasing subsequences (LIS)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countLIS(arr));
    }

    // Dynamic Programming approach to count LIS
    public static int countLIS(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int[] lengths = new int[n];
        int[] counts = new int[n];
        
        // Initialize lengths and counts for each element as a subsequence of length 1
        Arrays.fill(lengths, 1);
        Arrays.fill(counts, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    // If arr[i] is greater than arr[j], it can extend the increasing subsequence ending at arr[j]
                    if (lengths[i] < lengths[j] + 1) {
                        // Found a longer increasing subsequence ending at arr[i]
                        lengths[i] = lengths[j] + 1;
                        counts[i] = counts[j];
                        // The number of LIS ending at arr[i] is now the same as the number of LIS ending at arr[j]
                    } else if (lengths[i] == lengths[j] + 1) {
                        // Found another increasing subsequence of the same length ending at arr[i]
                        counts[i] += counts[j];

                    }
                }
            }
        }

        int maxLength = Arrays.stream(lengths).max().orElse(0);
        int totalCount = 0;
        // Count the number of subsequences with the maximum length

        for (int i = 0; i < n; i++) {
            if (lengths[i] == maxLength) {
                totalCount += counts[i];
            }
        }

        return totalCount;
    }
}


/*Write a method to find the number of longest increasing sub sequences
(LIS) found in the given array and return the same.  */