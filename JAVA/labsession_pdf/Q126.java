public class Q126 {
    public static String reverseAndConcat(String input1) {
        if (input1 == null || input1.trim().isEmpty()) {
            return "";
        }

        String[] words = input1.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseAndConcat(" I am Java "));
        System.out.println(reverseAndConcat("Wel come"));
        System.out.println(reverseAndConcat("Hello World"));
        System.out.println(reverseAndConcat("  abc def ghi  "));
    }
}
