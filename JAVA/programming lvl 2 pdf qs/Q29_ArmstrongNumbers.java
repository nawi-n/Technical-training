import java.util.*;

public class Q29_ArmstrongNumbers {
    static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = String.valueOf(n).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
    }
}