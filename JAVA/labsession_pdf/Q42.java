import java.util.Scanner;
public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = sumOfPrimeDigits(n);
        System.out.println(sum);    
    }
    public static int sumOfPrimeDigits(int n){
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (isPrime(digit)) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }
    public static boolean isPrime(int digit) {
        return digit == 2 || digit == 3 || digit == 5 || digit == 7;
    }
    
}
