import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        System.out.println("Character array:");
        for (char c : charArray) {
        System.out.print(c + " ");
        }
        System.out.println();
        sc.close();
    }
}
