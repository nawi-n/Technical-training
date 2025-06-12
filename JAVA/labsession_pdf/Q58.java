import java.util.Scanner;
public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = calculateArea(radius);
        if (area == -1) {
            System.out.println("Invalid radius. Radius must be non-negative.");
        } else {
            System.out.printf("The area of the circle is: %.2f%n", area);
        }


    }
    public static double calculateArea(double radius) {
        if (radius < 0) {
            return -1; 
        }
        return Math.PI * radius * radius; 
    }
    
}

/*Create a method to calculate the area of a circle given its radius. If the
radius is negative, the method should return -1.  */
