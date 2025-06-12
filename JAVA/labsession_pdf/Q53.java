import java.util.Scanner;
public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = isOddOrEven(number);
        System.out.println(result);
        sc.close();

    }
    

    public static String isOddOrEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

}
    
