import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        for(row=1;row<=n;row++, System.out.println()){
            for(col=1;col<=n*2;col++){
                    System.out.print( row + " ");
            }
        }
    }
}
