import java.util.Scanner;
public class Q83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxGuests = findMaxGuests(arr);
        System.out.println(maxGuests);
            }
    public static int findMaxGuests(int[] arr) {

            int n = arr.length;
            if (n == 0) return 0;
            int maxGuests = 0;
            int currentGuests = 0;
            for (int i = 0; i < n; i++) {
                currentGuests += arr[i];
                if (currentGuests > maxGuests) {
                    maxGuests = currentGuests;
                }
            }
            return maxGuests;

    }
    
}

/*A party has been organised on cruise. The party is organised for a limited time(T).
The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is
represented as elements of the array. The task is to find the maximum number of
guests present on the cruise at any given instance within T hours. */
