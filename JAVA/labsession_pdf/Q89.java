import java.util.Scanner;
public class Q89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        convertToUppercase(arr);
        System.out.println("Characters in uppercase:");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
    public static void convertToUppercase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toUpperCase(arr[i]);
        }

    }
    
}

/*You need to write a method that converts all characters in a given array
to uppercase.  */
