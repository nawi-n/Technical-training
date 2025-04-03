import java.util.*;

public class Q22_UglyNumber {

    static int IsUgly(int n){
        while(n%2==0) n/=2 ;
        while(n%3==0) n/=3 ;
        while(n%5==0) n/=5 ;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(IsUgly(n)==1 ? "YES" : "NO");
    }
}
