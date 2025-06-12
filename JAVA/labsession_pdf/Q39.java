import java.util.Scanner;
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int singleDigitSum = getSingleDigitSum(number);
        System.out.println("Single-digit sum: " + singleDigitSum);      
    }
    public static int getSingleDigitSum(long number) {
        int sum = 0;
        while (number != 0 || sum >= 10) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10; 
            number /= 10;
        }
        return sum;
    }
    
}
