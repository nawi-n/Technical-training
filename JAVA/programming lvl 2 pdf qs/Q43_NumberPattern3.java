import java.util.*;
public class Q43_NumberPattern3 {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + 1);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
