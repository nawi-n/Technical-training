import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int add = n1 + n2;
        int sub = n1 - n2;
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + Math.abs(sub));
        sc.close();
    
    }
}