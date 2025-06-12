import java.util.Scanner;
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiplicationTable(n);
        }
    public static void multiplicationTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }
    
}
