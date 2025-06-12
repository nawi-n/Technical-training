import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        int units;
        double tax,res;
        Scanner sc = new Scanner(System.in);
        units = sc.nextInt();
        if(units>=0 && units<=50){
            res = units*0.50;
        }
        else if(units>50 && units<=150){
            res = 25 + ((units-50)*0.75);
        }
        else if(units>150 && units<=250){
            res = 25 + 75 + ((units-150)*1.20);
        }
        else{
            res = 25 + 75 + 120 + ((units-250)*1.50);
        }
        
        tax= res * 0.2;
        res = res + tax;
        System.out.println(res);
        sc.close();

    }
}
