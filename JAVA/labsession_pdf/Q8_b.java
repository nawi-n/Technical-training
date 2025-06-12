import java.util.*;

public class Q8_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(n1>n2?n1>n3?n1:n3:n2>n3?n2:n3 + " is greater");
        sc.close();
    }
}