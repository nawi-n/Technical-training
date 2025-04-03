import java.util.Scanner;

public class Q39_LeftmostDigitDivides {
    static int leftMostDigit(long n){
        String str = String.valueOf(n);
        int len = str.length();
        char[] arr = str.toCharArray();
        for (int i=0;i<len;i++){
            if((arr[i]-'0')!=0 && n % (arr[i]-'0') == 0){
                return (int) arr[i]-'0';
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(leftMostDigit(num));
    }
    
}
