import java.util.Scanner;
public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int digitCount = countDigits(number);
        System.out.println("Total digits: " + digitCount);

    }
    public static int countDigits(long number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    
}
}
