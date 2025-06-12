import java.util.*;

public class Q65{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ch = (int) ('A');
        for(int i=1; i<=n ;i++, System.out.println()){
            for(int j=1 ; j<=i+1; j++){
                if(j==2 && i!=1){
                    System.out.print((char) (ch++));
                }
                else if(i==1 && j==2){
                    continue;
                }
                else{
                System.out.print('*');
                }
            }
        }

    }
} 
