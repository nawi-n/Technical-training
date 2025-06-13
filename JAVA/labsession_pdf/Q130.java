public class Q130 {
    public static int OperationsBinaryString(String str) {
        if (str == null || str.length() == 0)
            return -1;
        int result = str.charAt(0) - '0';
        for (int i = 1; i < str.length(); i += 2) {
            char operation = str.charAt(i);
            int nextBit = str.charAt(i + 1) - '0';

            switch (operation) {
                case 'A':
                    result = result & nextBit;
                    break;
                case 'B':
                    result = result | nextBit;
                    break;
                case 'C':
                    result = result ^ nextBit;
                    break;
                default:
                    return -1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "F58G4S8G418G";
        System.out.println(OperationsBinaryString(input)); 
    }
}
