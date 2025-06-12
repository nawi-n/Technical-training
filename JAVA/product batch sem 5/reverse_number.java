import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        int num;
        int rem,rev=0;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        while(num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println("the reversed number is: "+ rev);
    }
}
