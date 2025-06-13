import java.util.Scanner;
public class Q90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        countVowels(arr);
        sc.close();
        }
    public static void countVowels(char[] arr) {
        int count = 0;
        for (char c : arr) {
            if (isVowel(c)) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);           

    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}

/*You need to write a method that counts and prints the number of vowels
present in a given array of characters.  */
