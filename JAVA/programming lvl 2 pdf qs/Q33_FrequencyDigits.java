import java.util.*;
public class Q33_FrequencyDigits {
    static int[] digitFrequency(String n) {
         int[] freq = new int[10];
         for(char c : n.toCharArray()){
            freq[c - '0']++;
         }
         return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        int[] frequency = digitFrequency(n);
        for(int i=0;i<10;i++){
            System.out.println(i +" occurs "+ frequency[i] +" times" );
        }
    }
}