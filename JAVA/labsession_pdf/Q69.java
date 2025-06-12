import java.util.Scanner;
public class Q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            // Print 1 to i
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print stars: 2*(n - i) + 1
            for(int j = 1; j <= 2 * (n - i) + 2; j++) {
                System.out.print("* ");
            }

            // Print i to 1
            for(int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
