import java.util.Scanner;

public class Q38_DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String hex = Integer.toHexString(num).toUpperCase();
        System.out.println(hex);
    }
}
