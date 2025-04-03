import java.util.*;

public class Q32_HarshadNumber {
    static boolean isHarshad(int n) {
        int sum = 0,val;
        int temp =n;
        int digits = String.valueOf(n).length();
        while(temp>0){
            val = temp%10;
            sum += val;
            temp = temp/10;
        }
        return n%sum ==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isHarshad(n) ? "YES" : "NO");
    }
}