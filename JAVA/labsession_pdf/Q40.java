import java.util.Scanner;
import java.math.BigInteger; 

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
    }

    public static void factorial(int n){
        BigInteger res = BigInteger.ONE; 

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= n; i++) {
                res = res.multiply(BigInteger.valueOf(i));
            }

            System.out.println("Factorial of " + n + " is: " + res);
        }
    }
}
