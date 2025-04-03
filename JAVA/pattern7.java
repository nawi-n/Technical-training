import java.util.*;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col,a=0;
        for(row=1;row<=n;row++, System.out.println()){
            for(col=n;col>0;col--){
                if(col>=row){
                    a = a + (row+n-col);
                    System.out.print(a+" ");
                }
            }
            a=0;
        }
    }
}

/*

input:5

output:
1 3 6 10 15 
2 5 9 14    
3 7 12      
4 9         
5 

*/