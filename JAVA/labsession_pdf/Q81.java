import java.util.Scanner;
public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] uniqueArray = removeDuplicates(arr);
        System.out.println("Array with unique elements:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }   

    }
    public static int[] removeDuplicates(int[] arr) {

        int n = arr.length;
        if (n == 0) return new int[0];
        boolean[] seen = new boolean[1001]; 
        int uniqueCount = 0;
        for (int num : arr) {
            if (!seen[num]) {
                seen[num] = true;
                uniqueCount++;
            }
        }
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;
        for (int num : arr) {
            if (seen[num]) {
                uniqueArray[index++] = num;
                seen[num] = false; 
            }
        }
        return uniqueArray;
    }
    
}

/*Write a method to remove all repeated elements from an array. The
resultant array should have only unique elements.
 */
