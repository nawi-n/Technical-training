
public class Q133 {
    public static void main(String[] args) {

        int num1 = 65;
        int num2 = 9;
        int result = num1 & num2;
        System.out.println("Result of " + num1 + " & " + num2 + " is: " + result);
        System.out.println(
                "Binary of " + num1 + " : " + String.format("%8s", Integer.toBinaryString(num1)).replace(' ', '0'));
        System.out.println(
                "Binary of " + num2 + " : " + String.format("%8s", Integer.toBinaryString(num2)).replace(' ', '0'));
        System.out.println(
                "Binary result     : " + String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0'));
    }
}
