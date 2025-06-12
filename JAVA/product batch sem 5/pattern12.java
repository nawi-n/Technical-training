import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val=0;
        for(int i=1; i<=n;i++,System.out.println()){
            for (int j=1; j<=n; j++){
                if(i%2!=0){
                    val = val+j;

                    if(i<10){
                        System.out.print("0"+val+" ");

                    }
                    else{
                        System.out.print(j+" ");
                    }
                }
                else{
                    System.out.print("  ");
                }
                
            }
            val = 5*2;
        }
    }
}
