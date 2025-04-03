import java.util.*;;


public class Q24_BetrothedNumbers {
    static int sumOfDivisors(int n) {
        int sum =1;
        for(int i=2; i<n;i++){
            if(n%i ==0){
                sum += i;
            }
        }
        return sum;
    }

    static boolean IsBetrothed(int a , int b){
        return sumOfDivisors(a) == b + 1 && sumOfDivisors(b) == a + 1;

    }
        
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(IsBetrothed(a,b)? "Betrothed Number" : "Not a Betrothed Number");
    }
}