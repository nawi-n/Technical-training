import java.util.*;

public class Q35_RightRotateNumber {
        static int rightRotate(int n, int times) {
    
            String str = String.valueOf(n);
            String rotated = str.substring(str.length()-times)+str.substring(0,str.length()-times);
    
            return Integer.parseInt(rotated);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int times = sc.nextInt();
            sc.close();
            System.out.println(rightRotate(n, times));
        }
    }