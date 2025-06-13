import java.util.Scanner;
public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        printASCIIValues(arr);
    }
    public static void printASCIIValues(char[] arr) {
        System.out.println("ASCII values of the characters:");
        for (char c : arr) {
            System.out.println(c + ": " + (int)c);
        }
    }
    
}

/*to print ASCII values of all characters in the given
array. 
 */
