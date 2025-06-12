import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println(n1%100 == 0 ? "Divisible by 100" : "Not divisible by 100");
    }
}