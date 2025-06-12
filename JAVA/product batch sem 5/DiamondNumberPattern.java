import java.util.*;

public class DiamondNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Upper half of diamond
        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Printing numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Lower half of diamond
        for (int i = n - 1; i >= 1; i--) {
            // Printing spaces
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            // Printing numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
