import java.util.Scanner;

public class divisibility_check_bitwise {
    

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int v = (n & 7);
        System.out.println(v);
        if(v==0){
            System.out.println("divisible " + n);
        }
        else{
            System.out.println("not divisible "+n);
        }
        sc.close();
    }
}
