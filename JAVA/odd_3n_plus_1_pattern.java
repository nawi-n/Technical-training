import java.util.Scanner;

public class odd_3n_plus_1_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print(n+" ");

        while(n>1){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            System.out.print(n+" ");

        }

    }
}


/*
 input: 6
 output: 6 3 10 5 16 8 4 2 1 
*/