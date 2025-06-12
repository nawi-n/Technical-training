import java.util.Scanner;
public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        boolean result = binarySearch(arr, x);
        System.out.println(result);
    }
    public static boolean binarySearch(int[] array, int x) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (array[mid] == x) {
                return true;
            }

            // If x is greater, ignore left half
            if (array[mid] < x) {
                left = mid + 1;
            }
            // If x is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return false;
    }       
    
}

/*You need to write a method that searches for a value (x) in a sorted
array. If (x) is present in the array, the method should return `true`;
otherwise, it should return `false`. How will you design your method to
efficiently find (x) in the sorted array and determine its presence?
 boolean binarysearch (int array [], int x) {
// write code
}
Sample Input/out */
