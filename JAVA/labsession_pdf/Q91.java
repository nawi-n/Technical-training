import java.util.Scanner;
public class Q91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        printUniqueConsonants(arr);
        sc.close();
        }
    public static void printUniqueConsonants(char[] arr) {
        for (char c : arr) {
            c = Character.toLowerCase(c);
            if (isConsonant(c) && !isAlreadyPrinted(arr, c)) {
                System.out.print(c + " ");
            }
        }  
    }
    public static boolean isConsonant(char c) {
        return c >= 'a' && c <= 'z' && !isVowel(c);
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static boolean isAlreadyPrinted(char[] arr, char c) {
        for (char ch : arr) {
            if (Character.toLowerCase(ch) == c) {
                return true;
            }
        }
        return false;
    }
    
    
}

/* You need to write a method that identifies and prints the unique
consonants present in a given array of characters.  */