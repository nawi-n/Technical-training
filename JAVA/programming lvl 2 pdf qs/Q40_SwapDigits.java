import java.util.*;

public class Q40_SwapDigits {
    static int swapDigits(int n, int pos1, int pos2) {
    char[] arr = String.valueOf(n).toCharArray();
    int len = arr.length;
    char temp = arr[len - pos1];
    arr[len - pos1] = arr[len - pos2];
    arr[len - pos2] = temp;
    return Integer.parseInt(new String(arr));
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pos1 = sc.nextInt();
    int pos2 = sc.nextInt();
    sc.close();
    System.out.println(swapDigits(n, pos1, pos2));
    }
   }