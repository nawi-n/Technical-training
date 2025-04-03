import java.util.Scanner;

public class Q37_EvenOddDigitCheck {
    static boolean checkEvenOddDigit(String num) {
        int prod = 1, sum = 0;
        int len = num.length();
        char[] arr = num.toCharArray();

        for (int i = 0; i < len; i++) {
            int digit = arr[i] - '0'; // Convert character to integer
            
            if ((i + 1) % 2 == 0) { // 1-based indexing: Even place
                prod *= digit;
            } else { // Odd place
                sum += digit;
            }
        }

        return sum != 0 && prod % sum == 0; // Prevent division by zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();

        System.out.println(checkEvenOddDigit(num) ? "YES" : "NO");
    }
}
