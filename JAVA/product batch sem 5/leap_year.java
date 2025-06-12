import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        sc.close();
        if((year%4==0 & year%100!=0) || year%400 ==0){
            System.out.println("it is leap year and so yes it has a extra day in feb");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
