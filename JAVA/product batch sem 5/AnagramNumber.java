import java.util.Arrays;
import java.util.Scanner;

public class AnagramNumber {
    public static boolean areAnagram(int num1, int num2) {
        char[] arr1 = String.valueOf(num1).toCharArray();
        char[] arr2 = String.valueOf(num2).toCharArray();

        if (arr1.length != arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        if (areAnagram(num1, num2)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }

        scanner.close();
    }
}
