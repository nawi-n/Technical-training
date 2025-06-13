import java.util.LinkedHashMap;
import java.util.Map;

public class Q124 {
    public static char firstUniqueChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("RajaRam Mohan Roy"));
        System.out.println(firstUniqueChar("1234123"));
        System.out.println(firstUniqueChar("aabbcc"));
        System.out.println(firstUniqueChar("a bc a"));
        System.out.println(firstUniqueChar(""));
    }
}
