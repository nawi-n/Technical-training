public class Q111 {
    public static void main(String[] args) {
        String input = "hello";
        char[] charArray = convertToCharArray(input);
        printReversedArray(charArray);
    }

    public static char[] convertToCharArray(String str) {
        return str.toCharArray();
    }

    public static void printReversedArray(char[] array) {
        System.out.println("Reversed Character Array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
