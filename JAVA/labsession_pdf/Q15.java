import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        
        if (weight < 0) {
            System.out.println("INVALID INPUT");
        } else if (weight == 0) {
            System.out.println("0 minutes");
        } else if (weight > 7000) {
            System.out.println("OVERLOADED");
        } else if (weight <= 2000) {
            System.out.println("25 minutes");
        } else if (weight <= 4000) {
            System.out.println("35 minutes");
        } else {
            System.out.println("45 minutes");
        }
        
        sc.close();
    }
}