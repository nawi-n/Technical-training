public class Q125 {
    public static String fliterVowels(String input1) {
        if (input1 == null || input1.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (char ch : input1.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fliterVowels(" I am Java "));
        System.out.println(fliterVowels("Wel come "));
        System.out.println(fliterVowels("Programming123"));
        System.out.println(fliterVowels("Rhythm"));
    }
}
