
import java.util.Scanner;
public class Q138 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the bit position from left to set (starting at 1): ");
        int position = scanner.nextInt();

        String binary = Integer.toBinaryString(number);
        int length = Math.max(binary.length(), position);
        StringBuilder padded = new StringBuilder(binary);
        while (padded.length() < length) {
            padded.insert(0, '0');
        }

        padded.setCharAt(position - 1, '1');
        int result = Integer.parseInt(padded.toString(), 2);

        System.out.println("Updated number after setting bit: " + result);
        scanner.close();
}
}