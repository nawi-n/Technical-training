import java.util.Scanner;
public class Q84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];
        System.out.println("Enter elements of first matrix:");                                                                          
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] resultMatrix = sumMatrices(matrix1, matrix2);
        System.out.println("Resulting matrix after addition:"); 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static int[][] sumMatrices(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int m = matrix1[0].length;
        int[][] resultMatrix = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return resultMatrix;
    }
    
}

/*Write a method to find sum of two matrices and return the resulting
matrix.  */