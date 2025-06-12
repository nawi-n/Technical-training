import java.util.Scanner;
public class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = calculateArea(length, breadth);
        if (area == -1) {
            System.out.println("Invalid dimensions. Length and breadth must be non-negative.");
        } else {
            System.out.println("The area of the rectangle is: " + area);
        }

    }
    public static int calculateArea(int length, int breadth) {
        if (length < 0 || breadth < 0) {
            return -1; 
        }
        return length * breadth; }
    
}

/*. Create a method that calculates the area of a rectangle using its length
and breadth. If either the length or breadth is negative, the method should
return -1 */
