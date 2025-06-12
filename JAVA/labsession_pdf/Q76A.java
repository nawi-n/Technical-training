import java.util.Scanner;
public class Q76A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = findMin(arr);
        int operations = countOperations(arr, min);
        System.out.println(operations);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int countOperations(int[] arr, int min) {
        int operations = 0;
        for (int num : arr) {
            operations += Math.abs(num - min);
        }
        return operations;
    }

    
}

/*Make all array elements equal just by using decrement by 1 operation
or increment by 1 operation. You need to make all the values equal to the
minimum value in the given array. And, return the total number of
operations needed to make all the elements equal as per the given
description. */