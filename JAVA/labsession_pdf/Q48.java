import java.util.Scanner;
public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int decimalValue = 0;
        int base = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int digitValue;
            if (c >= '0' && c <= '9') {
                digitValue = c - '0'; // Convert character to integer
            } else if (c >= 'A' && c <= 'G') {
                digitValue = c - 'A' + 10; // Convert A-G to 10-16
            } else {
                System.out.println("Invalid character in input");
                return;
            }

            decimalValue += digitValue * base;
            base *= 17;
        }

        System.out.println(decimalValue);
        sc.close();

    }
    
}

/*Given a maximum of four digits to the base 17, as input, output its decimal value.
Note that, 10 is represented as A, 11 is represented as B, 12 is represented as C, F
is represented as 15, 16 is represented as G.
Sample Input : 23GF
Sample Output : 10980 */

