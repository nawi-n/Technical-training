import java.util.Scanner;
public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = solveEquation(a, b, c);
        System.out.println("Result: " + result);
    }

    public static int solveEquation(int a, int b, int c) {
        return (int) (Math.pow(a, 3) + Math.pow(a, 2) * b + 2 * Math.pow(a, 2) * b + 2 * a * Math.pow(b, 2) + a * Math.pow(b, 2) + Math.pow(b, 3));
    }
    
}
