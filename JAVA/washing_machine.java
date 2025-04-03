import java.util.Scanner;

public class washing_machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weight of clothes followed by the level of water");
        int w=sc.nextInt();
        char wl = sc.next().charAt(0);
        sc.close();
        switch (wl) {
            case 'l':
                if (w==0){
                    System.out.println("0 mins");
                }
                else if(w<=2000){
                    System.out.println("25 mins");
                }
                else if(w>2000){
                    System.out.println("OVERLOADED");
                }
                else{
                    System.out.println("invalid");
                }
                break;

            case 'm':
                if (w==0){
                    System.out.println("0 mins");
                }
                else if(w>2001 && w<=4000){
                    System.out.println("35 mins");
                }
                else if(w>4000){
                    System.out.println("OVERLOADED");
                }
                else{
                    System.out.println("invalid");
                }

                break;

            case 'h':
                if (w==0){
                    System.out.println("0 mins");
                }
                else if(w>4000 && w<=7000){
                    System.out.println("45 mins");
                }
                else if(w>7000){
                    System.out.println("OVERLOADED");
                }
                else{
                    System.out.println("invalid");
                }

                break;
            default:
                System.out.println("INVALID");
                break;
        } 
    }
}
