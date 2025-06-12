import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3)
        System.out.println(n1 + " is greater");
        else if(n2>n1 && n2>n3)
        System.out.println(n2 + " is greater");
        else
        System.out.println(n3 + " is greater");
        sc.close();
    
    }
}