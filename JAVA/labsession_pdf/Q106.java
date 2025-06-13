import java.util.Arrays;
public class Q106 {
    public static void main(String[] args) {
        char[] array = { 'A', 'B', 'C', 'D' };
        lowercasing(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    static void lowercasing(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] = (char) (array[i] + 32);
            }
        }
    }
}
