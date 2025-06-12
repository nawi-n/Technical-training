import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        double num1 = sc.nextDouble();
        System.out.println();
        double num2 = sc.nextDouble();
        System.out.println();
        char operation = sc.next().charAt(0);
        
        double result;
        
        switch (operation) {
            case 'a':
                result = num1 + num2;
                break;
            case 's':
                result = num1 - num2;
                break;
            case 'm':
                result = num1 * num2;
                break;
            case 'd':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            case 'u':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }
        
        System.out.printf("Result: %.2f\n", result);
    }
    
}
