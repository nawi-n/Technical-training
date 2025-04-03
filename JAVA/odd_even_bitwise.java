import java.util.Scanner;

public class odd_even_bitwise {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int v = n&1;
        if(v==0){
            System.out.println("Even " + n);
        }
        else{
            System.out.println("odd "+n);
        }
        sc.close();
    }
}
