import java.util.*;

public class Q70{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        for(int i=0; i<n;i++, System.out.println()){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=i; j<i*2+1; j++){
                System.out.print((i+1) + " ");
            }
            for(int j=i; j<i+2; j++){
                if(i%2 == 0){
                System.out.print( "# ");
                }
                else{
                System.out.print( "$ ");
                }
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
        }
    }
}