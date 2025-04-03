import java.util.*;

public class Q25_TriangularNumber {
    static boolean isTriangular(int n) {
        int sum=0;

        for(int i=1 ; i<n; i++){
            sum+=i;
            if(sum==n) return true;
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(isTriangular(n) ? "Triangular Number" : "Not a Triangular Number");
    }
}