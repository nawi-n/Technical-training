import java.util.Scanner;
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int totalTyres = 0;
        
        for (int i = 0; i < n; i++) {
            int cars = sc.nextInt(); 
            int twoWheelers = sc.nextInt(); 
            
            int tyresInDealership = (cars * 4) + (twoWheelers * 2);
            totalTyres += tyresInDealership;
            
            System.out.println("Tyres in dealership " + (i + 1) + ": " + tyresInDealership);
        }
        
        System.out.println("Total number of tyres: " + totalTyres);

    }
    
}
