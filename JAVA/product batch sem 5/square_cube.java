import java.util.Scanner;
import java.util.Arrays;

public class square_cube {
    public static void main(String[] args) {
        int n;


        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] sq = new int[n];
        int[] cu = new int[n];
        for(int i=1; i<=n ; i++){
            sq[i-1] = i*i;
            cu[i-1] = (i*i)*i;
        }

        System.out.println("The square of the first " + n + " natural numbers are " + Arrays.toString(sq));
        System.out.println("The cube of the first " + n + " natural numbers are " + Arrays.toString(cu));
        sc.close();;
    }
}
