import java.util.*;
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sq = new int[n];
        int[] cube = new int[n];
        int i =0;
        while(i<n){
            sq[i] = i*i;
            cube[i] = i*i*i;
            i++;
        }
        System.out.println("Squares:"+ Arrays.toString(sq));
        System.out.println("Cubes:"+ Arrays.toString(cube));


    }
    
}
