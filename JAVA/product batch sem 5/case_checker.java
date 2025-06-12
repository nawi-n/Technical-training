import java.util.Scanner;

public class case_checker {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);
        sc.close();
        if(Character.isLetter(c)){

            if(Character.isLowerCase(c)){
                System.out.println("is lower");
            }
            else{
                System.out.println("is upper");
            }
        }
        else{
            System.out.println("invalid alphabet");
        }


}
}
