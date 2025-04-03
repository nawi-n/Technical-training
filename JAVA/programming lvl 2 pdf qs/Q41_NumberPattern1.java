import java.util.*;
public class Q41_NumberPattern1 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
    
            int size = 2 * n - 1;
            int[][] arr = new int[size][size];
    
            int start = 0, end = size - 1, num = n;
    
            while (num > 0) {
                for (int i = start; i <= end; i++) {
                    arr[start][i] = num;
                    arr[end][i] = num;
                }
                for (int i = start; i <= end; i++) {
                    arr[i][start] = num;
                    arr[i][end] = num;
                }
                start++;
                end--;
                num--;
            }
    
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
    
