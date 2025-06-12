import java.util.Scanner;
public class Q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] frequency = new int[1001]; // Assuming integers are in the range 0-1000
        for (int num : arr) {
            frequency[num]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occured " + frequency[i]+" times");
            }
        }

    }
    
}

/*You‘re given with the size of the array and an array of integers; print the number
of times each integer has occurred in the array.
Sample Input 1:
10
1 2 3 3 4 1 4 5 1 2 */
