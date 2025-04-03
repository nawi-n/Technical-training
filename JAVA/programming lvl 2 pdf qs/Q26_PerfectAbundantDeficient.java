import java.util.*;

public class Q26_PerfectAbundantDeficient {
    static String classifyNumber(int n) {
        int sum =1;
        for(int i =2 ; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum == n ? "Perfect Number" : (sum > n ? "Abundant Number" : "Deficient Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(classifyNumber(n));
    }
}