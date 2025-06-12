import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n > n2 ? "First number is greater" : "Second number is greater");
        sc.close();
    }
}