import java.util.*;

public class Q31_KaprekarNumber {
    static boolean isKaprekar(int n) {
        long square = (long) n * n;  // Use long to handle large numbers
        String str = String.valueOf(square);
        int len = str.length();

        if (n == 1) return true;  

        for (int i = 1; i < len; i++) {
            String leftStr = str.substring(0, i);
            String rightStr = str.substring(i);

            // Ensure rightStr is not empty and does not start with multiple leading zeros
            if (!rightStr.isEmpty() && !(rightStr.startsWith("0") && rightStr.length() > 1)) {
                long left = leftStr.isEmpty() ? 0 : Long.parseLong(leftStr);  // Use Long.parseLong()
                long right = Long.parseLong(rightStr);  // Use Long.parseLong()

                if (right != 0 && left + right == n) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isKaprekar(n) ? "YES" : "NO");
    }
}
