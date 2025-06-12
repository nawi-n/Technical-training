import java.util.*;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("1");
            }
            System.out.println(); 
        }
    }
}


/*
 input : 5
 output :
    11111
   11111
  11111
 11111
11111

 */