import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);

        char ch2 = sc.next().charAt(0);
        System.out.println(ch1<ch2 ? ch1 +  "<" + ch2 + " is true" : ch1 +"<" + ch2 +" is false");
        System.out.println(ch1>ch2 ? ch1 + ">" + ch2 + " is true" : ch1 + ">" + ch2 + " is false");
        System.out.println(ch1==ch2 ? ch1 + "==" + ch2 + " is true" : ch1 + "==" + ch2 + " is false");
        System.out.println(ch1!=ch2 ? ch1 + "!=" + ch2 + " is true" : ch1 + "!=" + ch2 + " is false");
        System.out.println(ch1<=ch2 ? ch1 + "<=" + ch2 + " is true" : ch1 + "<=" + ch2 + " is false");
        System.out.println(ch1>=ch2 ? ch1 + ">=" + ch2 + " is true" : ch1 + ">=" + ch2 + " is false");
        sc.close();
    }
}