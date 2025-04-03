import java.util.Scanner;

public class positive_or_neg_bitwise {
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int v = n >> 31;
        System.out.println(v);
        if(v==0){
            System.out.println("positive " + n);
        }
        else{
            System.out.println("negative "+n);
        }
        sc.close();
    }
}