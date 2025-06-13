import java.util.Scanner;
public class Q98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        printMostFrequentCharacter(arr);
        sc.close();
    }
    public static void printMostFrequentCharacter(char[] arr) {
        int[] frequency = new int[256]; // Assuming ASCII characters
        for (char c : arr) {
            frequency[c]++;
        }
        int maxFrequency = 0;
        char mostFrequentChar = ' ';
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentChar = (char) i;
            } else if (frequency[i] == maxFrequency && (char) i < mostFrequentChar) {
                mostFrequentChar = (char) i;
            }
        }
        System.out.println("Character with maximum frequency: " + mostFrequentChar);
    }
    
}

/*You need to write a method to print characters which occurs maximum
number of times in the array. In case of dilemma, print the char which is
alphabetically low.  */
