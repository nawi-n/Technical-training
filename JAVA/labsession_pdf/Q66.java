import java.util.*;

public class Q66{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        for(int i=0; i<n;i++, System.out.println()){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j == n-i-1){
                System.out.print("# ");
                }
                else{
                System.out.print("  ");
                }
            }
        }
    }
}