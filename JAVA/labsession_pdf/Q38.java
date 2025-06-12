import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int digitsum = sumDigits(number);
        System.out.println("sum of digits: " + digitsum);

    }
    public static int sumDigits(long number) {
        int sum = 0;
        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            sum += number % 10; 
            number /= 10;
            
        }
        return sum;
    
}
}
