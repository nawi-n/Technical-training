import java.util.Scanner;
public class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        char operator = sc.next().charAt(0);
        int x = sc.nextInt();
        modifyMatrix(matrix, operator, x);
        System.out.println("Modified matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        }
    public static void modifyMatrix(int[][] matrix, char operator, int x) {

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                switch (operator) {
                    case '+':
                        matrix[i][j] += x;
                        break;
                    case '-':
                        matrix[i][j] -= x;
                        break;
                    case '*':
                        matrix[i][j] *= x;
                        break;
                    case '/':
                        if (x != 0) {
                            matrix[i][j] /= x;
                        } else {
                            System.out.println("Division by zero is not allowed.");
                        }
                        break;
                    case '%':
                        if (x != 0) {
                            matrix[i][j] %= x;
                        } else {
                            System.out.println("Modulo by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator.");
                }
            }
        }
            

    }
    
}

/* Write a method to perform given operation on all elements of the matrix.
Modify entire matrix, using the given x value, based on operator given operator.
Input operator can be '+' or '-' or '*' or '/' or '%'.  */
