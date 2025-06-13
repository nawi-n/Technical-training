
public class Q102 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 1, 9, 3 };
        sortDescending(arr);
        System.out.print("Sorted array (Descending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
