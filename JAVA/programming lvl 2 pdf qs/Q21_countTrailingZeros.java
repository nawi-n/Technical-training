import java.util.*;

public class Q21_countTrailingZeros {


    static int countTrailingZeros(int n){
        int count =0;

        while(n>=5){
            count +=  n/5;
            n = n/5;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countTrailingZeros(n));
    }

}


/*
Given an input value, count the number of trailing zeros in the factorial of the given number.

Sample Input
100
Sample Output
24

Sample Input 
5
Sample Output
1


*/