import java.util.Arrays;
import java.util.Scanner;

public class reverse_a_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=(arr.length - 1);i>=0;i--){
            if(!arr[i].isBlank()){
                System.out.print(arr[i]+" ");
            }            
        } 
    }

}
