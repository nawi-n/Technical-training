import java.util.Scanner;

public class divide_by_100 {
    public static void main(String[] args) {
        System.out.println("enter a num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n%100==0){
            System.out.println("Divisible by 100");
        }
        else{
            System.out.println("Not Divisible by 100");
        }

    }
}
