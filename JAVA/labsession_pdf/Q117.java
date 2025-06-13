public class Q117 {
    public static int LowerCaseCount(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(LowerCaseCount("Hello World!"));
        System.out.println(LowerCaseCount("Count The Letters"));
        System.out.println(LowerCaseCount("java123!@#"));
        System.out.println(LowerCaseCount("JAVA is FUN"));
    }
}
