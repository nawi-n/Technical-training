import java.util.Scanner;
public class Q99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        printLeastFrequentCharacter(arr);
        sc.close();
    }
    public static void printLeastFrequentCharacter(char[] arr) {
        int[] frequency = new int[256]; // Assuming ASCII characters
        for (char c : arr) {
            frequency[c]++;
        }
        int minFrequency = Integer.MAX_VALUE;
        char leastFrequentChar = ' ';
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0 && frequency[i] < minFrequency) {
                minFrequency = frequency[i];
                leastFrequentChar = (char) i;
            } else if (frequency[i] == minFrequency && (char) i < leastFrequentChar) {
                leastFrequentChar = (char) i;
            }
        }
        System.out.println("Character with minimum frequency: " + leastFrequentChar);
    }
    
}

/*You need to write a method to print characters which occurs minimum
number of times in the array. In case of dilemma, print the char which is
alphabetically low.  */
