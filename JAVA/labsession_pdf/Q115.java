public class Q115 {
    public static String getMiddleThree(String s) {
        int len = s.length();
        if (len < 3) {
            return s;
        }
        if (len % 2 != 0 && len >= 5) {
            int mid = len / 2;
            return s.substring(mid - 1, mid + 2);
        } else if (len % 2 == 0 && len >= 6) {

            int mid = len / 2;
            return s.substring(mid - 2, mid + 1);
        } else if (len == 4) {
            return s.substring(1, 4);
        } else if (len == 3) {
            return s;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(getMiddleThree("abcdefgh"));
        System.out.println(getMiddleThree("abcdef"));
        System.out.println(getMiddleThree("abcd"));
        System.out.println(getMiddleThree("abc"));
        System.out.println(getMiddleThree("ab"));
    }
}
