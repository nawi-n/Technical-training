import java.util.Scanner;
public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nthFibonacci(n);
    }
    public static void nthFibonacci(int n){
        int a = 0, b = 1, c=0;
        if (n == 0) {
            c = a;
        }       
        else if (n == 1) {
            c= b;
        }
        else{
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }}
        System.out.println(c);
    }
    
}
