import java.util.Scanner;
public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printcube(n);
    }
    public static void printcube(int n){
        for(int i=1; i<=n; i++){
            System.out.println("Cube(" + i + ")" + " = " + i*i*i);
        }    
    }
    
}