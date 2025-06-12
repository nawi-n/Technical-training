import java.util.*;
public class prime_factors {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        for(int i=2;i<=n;i++){
            if(n%i==0){                
                System.out.println(n+" ");
                }
            }
        }
    }
