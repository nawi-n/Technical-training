import java.util.Arrays;

public class Q101 {
    public static void main(String[] args) {
        int[] array = { 4, 2, 7, 1, 9, 3 };
        Insertionsort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void Insertionsort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
