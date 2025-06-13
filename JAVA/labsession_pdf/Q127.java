import java.util.*;

public class Q127 {
    public static void main(String[] args) {

        String input = "While";
        Set<String> keywords = new HashSet<>(Arrays.asList(
                "break", "case", "continue", "default", "defer", "else",
                "for", "func", "goto", "if", "map", "range", "return",
                "struct", "type", "var"));

        if (keywords.contains(input)) {
            System.out.println(input + " is a keyword");
        } else {
            System.out.println(input.toLowerCase() + " is not a keyword");
        }

    }
}
