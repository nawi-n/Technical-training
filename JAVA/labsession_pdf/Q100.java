import java.util.Scanner;
public class Q100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        printUniqueCharacters(arr);
        sc.close();
    }
    public static void printUniqueCharacters(char[] arr) {
        boolean[] seen = new boolean[256]; // Assuming ASCII characters
        for (char c : arr) {
            if (!seen[c]) {
                System.out.print(c + " ");
                seen[c] = true;
            }
        }
    }
    
}

/*You need to write a method that identifies and prints the unique
characters from a given array.  */
