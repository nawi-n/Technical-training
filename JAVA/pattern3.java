import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        int a=2,b=1;
        for(row=1;row<=n;row++, System.out.println()){
            for(col=1;col<=n;col++){
                if(col<=row){
                    if(row%2==0){
                        System.out.print( a + " ");
                        a=a+2;
                    }
                    else{
                        System.out.print( b +" ");
                        b=b+2;
                    }
                }
            }
            a=2;
            b=1;
        }
    }
}

/*

input:5

output:
1
2 4
1 3 5
2 4 6 8
1 3 5 7 9

*/