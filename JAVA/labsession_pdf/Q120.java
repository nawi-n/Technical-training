import java.util.*;

public class Q120 {
    public static String getDuplicateChars(String string1) {
        if (string1 == null || string1.isEmpty()) {
            return "";
        }
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char ch : string1.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                result.append(entry.getKey());
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(getDuplicateChars("programming"));
        System.out.println(getDuplicateChars("hello"));
        System.out.println(getDuplicateChars("AABBBBBC"));
        System.out.println(getDuplicateChars("RRR"));
        System.out.println(getDuplicateChars("xyz"));
    }
}
