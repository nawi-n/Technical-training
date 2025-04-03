import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        for(row=1;row<=n;row++, System.out.println()){
            for(col=1;col<=n;col++){
                if(row<=2 || row>=n-1 || col<=2 || col>=n-1){
                    System.out.print( 1 + " ");
                }
                else{
                    System.out.print(0+ " ");
                }
                }
            }
        }
    }


/*
input : 5
1 1 1 1 1
1 1 1 1 1
1 1 0 1 1
1 1 1 1 1
1 1 1 1 1

input : 6
1 1 1 1 1 1 
1 1 1 1 1 1
1 1 0 0 1 1
1 1 0 0 1 1
1 1 1 1 1 1
1 1 1 1 1 1 
 */