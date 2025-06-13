import java.util.Scanner;
public class Q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int sum = calculateASCIIValues(input);
        System.out.println("Sum of ASCII values: " + sum);
    }
    public static int calculateASCIIValues(String input) {
        
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += (int) input.charAt(i);
        }
        return sum;
    }
    
}


/*You need to write a method that calculates the sum of the ASCII values
of all characters in a given string. How will you design your method to iterate
through the string and compute the total ASCII sum for its characters? */