import java.util.Scanner;
public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isFibonacci(n)) {
            System.out.println(n + " is a Fibonacci number.");
        } else {
            System.out.println(n + " is not a Fibonacci number.");
        }   

    }
    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        int x1 = 5 * n * n + 4;
        int x2 = 5 * n * n - 4;
        return isPerfectSquare(x1) || isPerfectSquare(x2);
    }   
    public static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n);
    }

    
}
