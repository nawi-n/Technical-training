import java.util.Scanner;

public class add_sub_change_to_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two num");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a+b;
        int sub = a-b;
        if(sub < 0){
            //System.out.println("abosulte:" + abs(sub));
            sub = sub*(-1);
        }
        System.out.println("sum:"+ sum+ " "+ "sub:" + sub);
    }
}
