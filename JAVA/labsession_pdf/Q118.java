public class Q118 {
    public static int wordCount(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("The quick brown fox jumps over the lazy dog"));
        System.out.println(wordCount(" Hello world "));
        System.out.println(wordCount(""));
        System.out.println(wordCount("   multiple    spaces   between words  "));
        System.out.println(wordCount("OneWord"));
    }
}
