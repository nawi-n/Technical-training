import java.util.*;
public class Q137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int absNum = Math.abs(num);
        ArrayList<Integer> bits = new ArrayList<>();
        System.out.println(bits);
        String binary = Integer.toBinaryString(absNum);
        StringBuilder complement = new StringBuilder();

        for (char bit : binary.toCharArray()) {
            bits.add(bit == '0' ? 1 : 0);
            complement.append(bit == '0' ? '1' : '0');
        }

        int result = Integer.parseInt(complement.toString(), 2);
        if (num < 0) result = -result;
        System.out.println("1's Complement in decimal: " + result);
        sc.close();
}
}