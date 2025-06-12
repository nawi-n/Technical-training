import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        int n2 = random.nextInt(100) + 1;
        System.out.println("Random number 1: " + n);
        System.out.println("Random number 2: " + n2);
        int sum = n + n2;
        System.out.println("Sum: " + sum);

    }
}