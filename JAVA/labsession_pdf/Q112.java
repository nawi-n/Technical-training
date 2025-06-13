public class Q112 {
    public static void main(String[] args) {
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String result = convertToString(charArray);
        System.out.println("Converted String: " + result);
    }

    public static String convertToString(char[] array) {
        return new String(array);
    }
}
