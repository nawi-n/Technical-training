import java.util.Scanner;
public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5};
        int result = calculateFood(r, unit, arr);
        System.out.println(result);
    }
    public static int calculateFood(int r, int unit, int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int totalFood = 0;
        for (int food : arr) {
            totalFood += food;
        }
        if (totalFood >= r * unit) {
            return 1;
        } else {
            return 0;
        }


    }
    
}

/*The method accepts two positive integers ‗r‘ and ‗unit‘ and a positive integer
array ‗arr‘ of size ‗n‘ as its argument ‗r‘ represents the number of rats present in
an area, ‗unit‘ is the amount of food each rat consumes and each ith element of
array ‗arr‘ represents the amount of food present in ‗i+1‘ house number, where 0
<= i.
Note: Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the
rats. */
