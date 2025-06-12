import java.util.*;

public class Q64{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        for(int i=0; i<n;i++, System.out.println()){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        }
    }
}