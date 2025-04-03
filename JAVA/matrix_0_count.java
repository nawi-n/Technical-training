import java.util.Scanner;

public class matrix_0_count {
    public static void main(String[] args) {
        //if it is the multiple then should print 1 and also should retai it tto the next row and if it again gets matched then should invers it, and then should return the number of zeros on the last row
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] arr = new int[50];
        for(i=1;i<=n;i++){
            if((Math.pow(i,0.5) == (int) Math.pow(i,0.5))){
                arr[i]=i;
            }
        }
        System.out.println(Math.sqrt(arr[arr.length - 1]));
    }    
}
