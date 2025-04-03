import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n*2-1;i++,System.out.println()){
            for (int j=1; j<=n*2; j++){
                if((i==j && i<=n) || (i+j==n*2+1 && i<n && j<=(n*2)+1) && i>0 ){
                    System.out.print(i+ " ");
                }
                if((i==j && i>n) || (i+j==n*2+1 && i>n) && i>1){
                    System.out.print(n*2-i+" ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
        }
    }
}
