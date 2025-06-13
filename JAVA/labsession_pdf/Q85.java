import java.util.Scanner;
public class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int[][] matrix2 = new int[n][m];
        System.out.println("Enter elements of first matrix:");  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] resultMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    resultMatrix[i][j] += matrix[i][k] * matrix2[k][j];
                }
            }
        }   
        System.out.println("Resulting matrix after multiplication:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }   
        


    }
    
}

//85. to multiply two matrices and return the resulting matrix. 