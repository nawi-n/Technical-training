public class Q103 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 1, 9, 3 };
        reverseArr(arr);
        System.out.print("Reversed array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArr(int[] array) {
        int n = array.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
