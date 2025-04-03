import java.util.Scanner;

public class bitonic {
    public static void main(String[] args) {
        int i,n,flag=0;
        String s="";
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(i=0; i<n-1; i++){
            if(arr[i]<arr[i+1] && s.charAt(s.length()-1) != 'A'){
                s = s+"A";
            }
            else if (arr[i]>arr[i+1] && s[-1] != "D"){
                s = s + "D";
            }
        }

        if(s.length()==2){
            System.out.println("BITONIC");
        }
        else{
            System.out.println("NOT BITONIC");
        }
    }
}
