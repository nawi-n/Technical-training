import java.util.Scanner;

public class reverse_last_kdigits {
    public static int reverseLastKDigits(int num, int k) {
        String numStr = String.valueOf(num);
        int len = numStr.length();

        if (k > len) {
            return -1;  
        }

        String firstPart = numStr.substring(0, len - k);
        String lastPart = new StringBuilder(numStr.substring(len - k)).reverse().toString();

        return Integer.parseInt(firstPart + lastPart);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("Enter value of k: ");
        int k = scanner.nextInt();

        int result = reverseLastKDigits(num, k);

        if (result == -1) {
            System.out.println("k is larger than the number of digits.");
        } else {
            System.out.println(result);
        }

        scanner.close();
    }
}
