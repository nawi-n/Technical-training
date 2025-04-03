import java.util.*;

public class Q30_BetrothedNumberRange {
    static int sumOfDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        
        for (int a = start; a <= end; a++) {
            int b = sumOfDivisors(a) - 1;
            if (b > a && b <= end && sumOfDivisors(b) - 1 == a) {
                System.out.println(a + " " + b);
            }
        }
    }
}