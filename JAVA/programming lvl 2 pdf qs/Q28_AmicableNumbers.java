import java.util.*;

public class Q28_AmicableNumbers{
    static int sumofdivisors(int n) {
        int sum = 1;
        for(int i =2;i*i<n;i++){
            if(n%i==0){
                sum+=i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        
        List<int[]> pairs = new ArrayList<>();
        for(int i = start; i<end-1;i++){
            for(int j=i+1;j<end;j++){
                if(sumofdivisors(i)== j && sumofdivisors(j)== i) System.out.println(i+" "+j);
            }
        }
        
        
    }
}