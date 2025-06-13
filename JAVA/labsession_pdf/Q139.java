
public class Q139 {
    public static void main(String[] args) {

        // int number = 15;
        // int n = 3;
        int number = 89;
        int n = 5;
        String binary = Integer.toBinaryString(number);
        int maxLength = binary.length() - n;
        // binary = String.format("%" + maxLength + "s", binary).replace(' ', '0');
        char[] bits = binary.toCharArray();
        bits[maxLength] = '0';
        String modifiedBinary = new String(bits);
        int updatedNumber = Integer.parseInt(modifiedBinary, 2);
        System.out.println("\nOriginal Binary     : " + binary);
        System.out.println("Modified Binary     : " + modifiedBinary);
        System.out.println("Updated Decimal     : " + updatedNumber);
    }
}
