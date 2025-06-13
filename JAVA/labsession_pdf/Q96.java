import java.util.Scanner;
public class Q96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String upperCaseString = input.toLowerCase();
        System.out.println("Lowercase string: " + upperCaseString);
        sc.close();

    }
    
}
/*converts all the letters in a given string
to uppercase. */