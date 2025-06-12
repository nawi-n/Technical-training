import java.util.Scanner;
public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        boolean isMultiple = isMultiple(n, x);
        if (isMultiple) {
            System.out.println(n + " is a multiple of " + x);
        } else {
            System.out.println(n + " is not a multiple of " + x);
        }

    }
    public static boolean isMultiple(int n, int x) {
        return n % x == 0;
    }
}

/*Create a method that checks if a given number (N) is a multiple of
another number (X). The method should return `true` if (N) is indeed a
multiple of (X), and `false` if it is not. */
