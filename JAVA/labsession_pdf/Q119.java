import java.util.Arrays;

public class Q119 {
    public static String[] getAllWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return new String[0];
        }
        return sentence.trim().split("\\s+");
    }

    public static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        printArray(getAllWords("The quick brown fox jumps over the lazy dog"));
        printArray(getAllWords(" Hello world "));
        printArray(getAllWords("    "));
        printArray(getAllWords("Java     is   awesome!"));
        printArray(getAllWords("OneWord"));
    }

}
