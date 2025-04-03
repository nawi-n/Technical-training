import java.util.Scanner;

public class Q45_NumberPattern5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            int num = n;
            for (int j = 0; j < m; j++) {
                System.out.print(num);
                if (j >= i) num--;
            }
            System.out.println();
        }
    }
}