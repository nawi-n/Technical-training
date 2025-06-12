import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        for(row=1;row<=n;row++, System.out.println()){
            for(col=1;col<=n;col++){
                if(row==col){
                    System.out.print( 0+row + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
    }
}

/*

input: 5

output:
1 1 1 1 1 
      1
    1
  1
1 1 1 1 1

 */