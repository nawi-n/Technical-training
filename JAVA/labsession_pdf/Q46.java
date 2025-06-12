import java.util.Scanner;
public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* You have a number and need to check if it is an Armstrong number.
An Armstrong number is one where the sum of the cubes of its digits equals
the number itself. Write a method to test this property.
How will you design your method to compute the cubes of the digits, add
them up, and confirm if the total matches the original number?
 */
        int n = sc.nextInt();
        sc.close();
        
        boolean isArmstrong = isArmstrong(n);
        
        System.out.println(isArmstrong ? "Armstrong" : "Not Armstrong");

    }
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sumOfCubes = 0;

        while (n > 0) {
            int digit = n % 10;
            sumOfCubes += digit * digit * digit; 
            n /= 10; 
        }
        return sumOfCubes == originalNumber;
}
}
    

