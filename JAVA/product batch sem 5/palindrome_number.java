import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        int num;
        int rem,rev=0;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        int temp = num;
        while(num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }

        if(temp==rev){
            System.out.println("PALINDROME ");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
    }
}

