import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        for(row=1;row<=n;row++, System.out.println()){
            for(col=1;col<=n;col++){
                if(row==1 || row==n || col==1 || col==n || row==col || row+col == n+1){
                    System.out.print( 1 + " ");
                }
                else{
                    System.out.print( "a ");
                }
            }
        }
    }
}


/*

input : 5
output :
1 1 1 1 1 
1 1 a 1 1
1 a 1 a 1
1 1 a 1 1
1 1 1 1 1

 */