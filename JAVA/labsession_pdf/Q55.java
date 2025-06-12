import java.util.Scanner;
public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int area = calculateArea(a);
        System.out.println("The area of the square is: " + area);

    }
    public static int calculateArea(int a) {
        return a * a;

    }
    
}

/*. Create a method that calculates the area of a square, given the side
length, a. If the length is negative, the method should return -1. */