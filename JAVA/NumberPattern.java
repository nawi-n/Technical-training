import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        for (int row = 0; row < n; row++) {
            for (int i = n; i > n - row; i--) {
                System.out.print(i);
            }
            
            for (int i = 0; i < (2 * (n - row)); i++) {
                System.out.print(n - row);
            }
            
            for (int i = n - row + 1; i <= n; i++) {
                System.out.print(i);
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
