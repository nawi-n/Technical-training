import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printodd(n);
    }
    public static void printodd(int n){
        for(int i=1; i<=n; i+=2){
            System.out.print(i+" ");
        }

    }
    
}
