import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        double n1,n2;
        char op;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        op = sc.next().charAt(0);
        sc.close();

        switch (op) {
            case '-':
                System.out.println(n1-n2);
                break;
            case '+':
                System.out.println(n1+n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '%':
                System.out.println(n1%n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;

            case '^':
                System.out.println(power(n1,n2));
                break;
        
            default:
                System.out.println("invalid operation");
                break;
        }
    }
    static double power(double n, double p){
        if (p==0){
            return 1;
        }
        else{
            return n* power(n, p-1);
        }
    }
}
