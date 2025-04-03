import java.util.*;

public class segregate_odd_eve {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close(); 
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));   



    }
}

    /*
Print Odd Even Segregation Array
Sample Input
7
5 7 3 9 1 8 4
Sample Output
[5, 7, 3, 9, 1, 8, 4]

 */