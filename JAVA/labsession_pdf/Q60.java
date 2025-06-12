import java.util.*;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=1;i<=s.length();i++){
            for(int j=1; j<=i;j++){
                System.out.print(s.charAt(i-1));
            }
            System.out.print(" ");

        }
        sc.close();
    }
}

/*

60. Write a program to understand nested loops. Print the letters of the word
as shown below.
Example:
Sample input as ―possible‖
Sample output: p oo sss ssss iiiii bbbbbb lllllll eeeeeeee.
Explanation:
The ith character is printed  ̳i‘ times.
That is, first character  ̳p‘ is printed one time.
And, second character ‘o‘ is printed two times and so on.

 */