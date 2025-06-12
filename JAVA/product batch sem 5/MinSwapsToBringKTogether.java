import java.util.Scanner;

class MinSwapsToBringKTogether {
    public static int minSwapsToBringKTogether(int[] arr, int k) {
        int n = arr.length;
        
        int count_k = 0;
        for (int num : arr) {
            if (num <= k) count_k++;
        }

        if (count_k == 0 || count_k == n) return 0;

        int bad = 0;
        for (int i = 0; i < count_k; i++) {
            if (arr[i] > k) bad++;
        }

        int min_swaps = bad;
        for (int i = count_k; i < n; i++) {
            if (arr[i - count_k] > k) bad--;
            
            if (arr[i] > k) bad++;
            
            min_swaps = Math.min(min_swaps, bad);
        }

        return min_swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
  
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        sc.close();

        System.out.println(minSwapsToBringKTogether(arr, k)); // Output: 1
    }
}


/*
input:
8
4 3 5 2 7 6 8 7
3

output:
1

*/