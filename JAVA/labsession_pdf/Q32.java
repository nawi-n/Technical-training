import java.util.Scanner;
public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == 0) {
            System.out.print(a + " ");
            return;
        }
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }   
    
}
