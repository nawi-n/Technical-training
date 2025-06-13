public class Q123 {
    public static int countDuplicateDigits(int input1) {
        int[] digitCount = new int[10];
        String numStr = String.valueOf(input1);
        for (char ch : numStr.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                digitCount[digit]++;
            }
        }
        int duplicateCount = 0;
        for (int count : digitCount) {
            if (count > 1) {
                duplicateCount++;
            }
        }
        return duplicateCount;
    }

    public static void main(String[] args) {
        System.out.println(countDuplicateDigits(949188));
        System.out.println(countDuplicateDigits(8849848));
    }
}
