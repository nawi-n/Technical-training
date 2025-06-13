public class Q121 {
    public static String truncate(String input1) {
        if (input1 == null) {
            return "";
        }
        return input1.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        System.out.println(truncate(" Welcome to Java "));
        System.out.println(truncate(" Wel come "));
        System.out.println(truncate("Tabs\tand\nLines"));
        System.out.println(truncate("   OnlySpaces   "));
        System.out.println(truncate(""));
    }
}
