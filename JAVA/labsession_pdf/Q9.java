import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();  
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        if (n1 > n2 && n1 > n3 && n1 > n4) {
            System.out.println(n1 + " is the greatest");
        } else if (n2 > n1 && n2 > n3 && n2 > n4) {
            System.out.println(n2 + " is the greatest");
        } else if (n3 > n1 && n3 > n2 && n3 > n4) {
            System.out.println(n3 + " is the greatest");
        } else {
            System.out.println(n4 + " is the greatest");
        }
        if (n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println(n1 + " is the smallest");
        } else if (n2 < n1 && n2 < n3 && n2 < n4) {
            System.out.println(n2 + " is the smallest");
        } else if (n3 < n1 && n3 < n2 && n3 < n4) {
            System.out.println(n3 + " is the smallest");
        } else {
            System.out.println(n4 + " is the smallest");
        }     
              
        sc.close();
    }
}