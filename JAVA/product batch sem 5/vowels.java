import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);
        if((c>='a' && c<='z')||(c>='A' && c<='Z')){

            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("vowel");
            }
            else{
                System.out.println("consonant");
            }
        }
        else{
            System.out.println("not a alphabet");
        }
        sc.close();
    }
    
}
