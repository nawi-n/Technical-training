import java.util.Scanner;
public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int carries = numberOfCarries(num1, num2);
        System.out.println(carries);
    }
    public static int numberOfCarries(int num1, int num2) {
        int carry = 0;
        int count = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int sum = digit1 + digit2 + carry;

            if (sum >= 10) {
                carry = 1; 
                count++; 
            } else {
                carry = 0; 
            }

            num1 /= 10; 
            num2 /= 10;
        }

        return count;
    }
    
}

/*A carry is a digit that is transferred to left if sum of digits exceeds 9 while
adding two numbers from right-to-left one digit at a time. You are required to
implement the following method.
int numberOfCarries (int num1, int num2);
The methods accept two numbers ‗num1‘ and ‗num2‘ as its arguments.
You are required to calculate and return the total number of carries generated
while adding digits of two numbers ‗num1‘ and ‗num2‘. */

