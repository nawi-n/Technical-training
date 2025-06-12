import java.util.Scanner;
public class Q59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal = sc.nextFloat();

        float number_of_years = sc.nextFloat();
        float rateOfInterest = sc.nextFloat();
        float simpleInterest = findSI(principal, number_of_years, rateOfInterest);
        float compoundInterest = findCI(principal, number_of_years, rateOfInterest);
        if (simpleInterest == -1 || compoundInterest == -1) {
            System.out.println("Invalid input. Principal, number of years, and rate of interest must be non-negative.");
        } else {
            System.out.printf("Simple Interest: %.2f%n", simpleInterest);
            System.out.printf("Compound Interest: %.2f%n", compoundInterest);
        }
    }
    public static float findSI(float principal, float number_of_years, float rateOfInterest) {
        if (principal < 0 || number_of_years < 0 || rateOfInterest < 0) {
            return -1; 
        }
        return (principal * number_of_years * rateOfInterest) / 100; 
    }
    public static float findCI(float p, float n, float r) {

        if (p < 0 || n < 0 || r < 0) {
            return -1; 
        }
        return (float)(p * Math.pow((1 + r / 100), n) - p); 
    }
    
}

/*Create a method that calculates both simple interest and compound
interest given the principal (p), the number of years (n), and the rate of
interest (r). If any of these values are negative, the method should return -1.
How will you implement this method to compute the interests accurately and
handle invalid inputs?
float findSI (float principal, float number_of_years, float rateOfInterest) {
// write code
}
float findCI (float p, float n, float r) {
// write code
}
Hint:
Simple interest = (P *N * R) / 100
Compound Interest =(P*(1+R/100)) ^N − P
In java: Use Math.pow (x, y) to calculate the x^y */