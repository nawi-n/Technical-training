import java.util.Scanner;
public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        
        boolean isStrong = isStrongNumber(n);
        System.out.println(isStrong ? "Strong Number" : "Not a Strong Number");
    }
    public static boolean isStrongNumber(int n) {
        int originalNumber = n;
        int sumOfFactorials = 0;

        while (n > 0) {
            int digit = n % 10;
            sumOfFactorials += factorial(digit);
            n /= 10;
        }

        return sumOfFactorials == originalNumber;
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
