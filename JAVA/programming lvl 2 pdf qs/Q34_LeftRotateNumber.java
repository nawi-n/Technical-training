import java.util.*;
public class Q34_LeftRotateNumber {
    static int leftRotate(int n, int times) {

        String str = String.valueOf(n);
        String rotated = str.substring(times)+str.substring(0,times);

        return Integer.parseInt(rotated);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int times = sc.nextInt();
        sc.close();
        System.out.println(leftRotate(n, times));
    }
}