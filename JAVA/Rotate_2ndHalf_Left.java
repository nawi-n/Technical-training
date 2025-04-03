import java.util.Scanner;

public class Rotate_2ndHalf_Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int r = sc.nextInt();
        int start = n / 2;
        int len = n - start;
        r = r % len;
        
        reverse(arr, start, start + r - 1);
        reverse(arr, start + r, n - 1);
        reverse(arr, start, n - 1);
        
        System.out.println("Rotated array is");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}