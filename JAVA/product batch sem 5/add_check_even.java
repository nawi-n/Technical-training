import java.util.Scanner;

public class add_check_even {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b= sc.nextInt();
        sc.close();

        int sum = a+b;
        if (sum%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
