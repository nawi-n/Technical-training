import java.util.*;

public class Q105 {
    public static void main(String[] args) {
        String input = "WELCome";
        String toggled = toggleCase(input);
        System.out.println("Original: " + input);
        System.out.println("Toggled: " + toggled);
    }

    static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        List<Character> capitalVowels = Arrays.asList('A', 'E', 'I', 'O', 'U');
        List<Character> smallVowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c) && !capitalVowels.contains(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c) && !smallVowels.contains(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }
        return toggled.toString();
    }
}
