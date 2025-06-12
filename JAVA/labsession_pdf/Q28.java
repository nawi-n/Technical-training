import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printeve(n);
    }
    public static void printeve(int n){
        for(int i=0; i<=n; i+=2){
            System.out.print(i+" ");
        }

    }
    
}
