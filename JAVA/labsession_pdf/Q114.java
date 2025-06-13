public class Q114 {
    public static String getFirstMiddleLast(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        char first = s.charAt(0);
        char middle = s.charAt((s.length() - 1) / 2);
        char last = s.charAt(s.length() - 1);

        return "First Character: " + first + "\n" +
                "Middle Character: " + middle + "\n" +
                "Last Character: " + last;
    }

    public static void main(String[] args) {
        System.out.println(getFirstMiddleLast("abcdefgh"));
        System.out.println(getFirstMiddleLast("abcdef"));
    }
}
