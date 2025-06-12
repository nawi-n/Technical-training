import java.util.Scanner;
import java.math.BigInteger; 

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        BigInteger res = factorial(n).divide(factorial(r).multiply(factorial(n - r)));
        System.out.println(res);
    }

    public static BigInteger factorial(int n){
        BigInteger res = BigInteger.ONE; 

        if (n < 0) {
            return BigInteger.ZERO; 
        } 
        else if (n == 0 || n == 1) {
            return BigInteger.ONE; 
        } 
        else {
            for (int i = 1; i <= n; i++) {
                res = res.multiply(BigInteger.valueOf(i));
            }

            return res;
        }
    }
}
