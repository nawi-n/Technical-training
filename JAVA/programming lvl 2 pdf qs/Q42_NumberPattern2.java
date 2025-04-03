import java.util.Scanner;

public class Q42_NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int val = 5;
        for (int i = 0; i < n*2+1; i++) {
            for (int j = 0; j < n; j++) {
                if (i !=0 && i!= n*2 && j==n/2) {

                    if(i<n){
                        System.out.print(i);
                    }
                    else if(i>=n){
                        
                        System.out.print(val--);
                    }
                }

                else 
                    System.out.print(n);
            }
            System.out.println();
        }
    }
}
