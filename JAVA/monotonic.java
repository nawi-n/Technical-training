import java.util.Arrays;
import java.util.Scanner;

public class monotonic {
    public static void main(String[] args) {
        int i,n,flag=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                flag =0;
            }
        }

        if(flag == 1){
            System.out.println("MONOTONIC");
        }
        else{
            System.out.println("NOT MONOTONIC");
        }
    }
}
