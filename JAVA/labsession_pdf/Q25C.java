import java.util.Scanner;
public class Q25C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int choice;
        do{
            System.out.println("Choose an operation: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 to exit");
            choice = sc.nextInt();
            if (choice == 5) {
                break;
            }
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);

    }
    
}
