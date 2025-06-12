import java.util.Scanner;
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printaquare(n);
    }
    public static void printaquare(int n){
        for(int i=1; i<=n; i++){
            System.out.println("Square(" + i + ")" + " = " + i*i);
        }    
    }
    
}