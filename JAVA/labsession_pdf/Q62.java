import java.util.*;

public class Q62{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c=='#'){
                System.out.print(c);
            }
        }
        for(char c : s.toCharArray()){
            if(c!='#'){
                System.out.print(c);
            }
        }
    }
}