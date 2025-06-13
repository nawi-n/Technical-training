import java.util.Scanner;
public class Q97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int count = 0;
                for (char d : input.toCharArray()) {
                    if (c == d) {
                        count++;
                    }
                }
                System.out.println(c + ": " + count);
            }
        }   
        sc.close();

    }
    
}

/*You need to write a method that counts and prints the frequency of each
character present in a given string */
