import java.util.*;

public class TerrainDigging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] L = new int[N];

        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }

        int days = 0;

        for (int i = N - 2; i >= 0; i--) {
            while (L[i] >= L[i + 1]) {
                int reduction = (1 << days);
                L[i] -= reduction;
                days++;
            }
        }

        System.out.println(days);
        sc.close();
    }
}
