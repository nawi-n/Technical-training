public class Q110 {
    public static void main(String[] args) {
        String str = "abc";
        String[] substrings = getSubstrings(str);
        System.out.println("Substrings of \"" + str + "\":");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }

    static String[] getSubstrings(String str) {
        int n = str.length();
        String[] substrings = new String[n * (n + 1) / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings[index++] = str.substring(i, j);
            }
        }
        return substrings;
    }
}
