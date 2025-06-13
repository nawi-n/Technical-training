import java.util.Scanner;
public class Q80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countLDS(arr));
    }
    // Method to count the number of longest decreasing subsequences (LDS)
    public static int countLDS(int[] arr) {

        int n = arr.length;
        if (n == 0) return 0;
        int[] lengths = new int[n];
        int[] counts = new int[n];
        // Initialize lengths and counts for each element as a subsequence of length 1
        for (int i = 0; i < n; i++) {
            lengths[i] = 1;
            counts[i] = 1;
        }       
        // Dynamic Programming approach to count LDS
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    // If arr[i] is smaller than arr[j], it can extend the decreasing
// subsequence ending at arr[j]

                    if (lengths[i] < lengths[j] + 1) {
                        // Found a longer decreasing subsequence ending at arr[i]
                        lengths[i] = lengths[j] + 1;
                        counts[i] = counts[j];
                        // The number of LDS ending at arr[i] is now the same as the number of LDS ending at arr[j]
                    } else if (lengths[i] == lengths[j] + 1) {
                        // Found another decreasing subsequence of the same length ending at arr[i]
                        counts[i] += counts[j];
                    }
                }
            }
        }

        int maxLength = 0;
        for (int length : lengths) {
            maxLength = Math.max(maxLength, length);
        }

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

/*Write a method to find the number of longest decreasing sub sequence
(LDS) found in the given array and return the same. The LDS problem seeks
the longest subsequence where each element is smaller than the preceding
one, while maintaining the original order. */
