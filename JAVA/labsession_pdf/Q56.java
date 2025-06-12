import java.util.Scanner;
public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int vol = calculateVolume(a);
        System.out.println("The volume of the square is: " + vol);

    }
    public static int calculateVolume(int a) {
        return a * a * a;

    }
    
}

/*. Create a method that calculates the VOLUME of a square, given the side
length, a. If the length is negative, the method should return -1. */