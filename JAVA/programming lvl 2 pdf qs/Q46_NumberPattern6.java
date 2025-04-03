import java.util.Scanner;

public class Q46_NumberPattern6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int num = 1;
        for (int i = 0; i < n; i++) {
            int start = num;
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%02d ", num++);
                }
            } else {
                num += n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.printf("%02d ", num--);
                }
                num = start + n;
            }
            System.out.println();
        }
    }
}