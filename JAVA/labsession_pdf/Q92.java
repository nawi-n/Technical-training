import java.util.Scanner;
public class Q92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        countLowerConsonantsUpperVowels(arr);
        sc.close();
        }
    public static void countLowerConsonantsUpperVowels(char[] arr) {
        int lowerConsonantCount = 0;
        int upperVowelCount = 0;
        for (char c : arr) {
            if (Character.isLowerCase(c) && isConsonant(c)) {
                lowerConsonantCount++;
            } else if (Character.isUpperCase(c) && isVowel(c)) {
                upperVowelCount++;
            }
        }
        System.out.println("Number of lowercase consonants: " + lowerConsonantCount);
        System.out.println("Number of uppercase vowels: " + upperVowelCount);
    }
    public static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return c >= 'a' && c <= 'z' && !isVowel(c);
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}


/*You need to write a method that counts and prints the number of lower
case consonants and upper case vowels in a given array of characters.  */