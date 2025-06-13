public class Q116 {
    public static int upperCaseCount(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(upperCaseCount("Hello World!"));
        System.out.println(upperCaseCount("Count The CAPS"));
        System.out.println(upperCaseCount("java123!@#"));
        System.out.println(upperCaseCount("JAVA is FUN"));
    }
}
