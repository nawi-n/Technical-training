import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n%27 == 0 ? "Divisible by 27" : "Not divisible by 27");
        sc.close();
    }
}