import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println(sum%2 == 0 ? "Even" : "Odd");
    }
}