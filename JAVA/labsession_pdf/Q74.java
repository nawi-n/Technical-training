import java.util.*;
public class Q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = Arrays.stream(arr).sum();
        System.out.println("----------"+ sum);
    }
    
}

/*to sum array elements */
