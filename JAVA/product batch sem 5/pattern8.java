import java.util.*;
public class pattern8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col,k=0;
        for(row=1;row<=n;row++, System.out.println()){
            k = row;
            for(col=n;col>=row;col--){
                if(col==n){
                    System.out.print(row+" ");
                }
                else{
                    System.out.print(k+" ");
                }
                k += col;
            }
           
        }
    }
}

/*

input:5

output:
1 6 10 13 15 
2 7 11 14
3 8 12
4 9
5 

*/