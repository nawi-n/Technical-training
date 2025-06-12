import java.util.Scanner;

public class greatest_digit_in_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[50];
        arr = String.valueOf(n).split("");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
            }
        }
        System.out.println(max);
    }
}
