public class Q122 {
    public static int filterDigits(String input1) {
        if (input1 == null || input1.isEmpty()) {
            return 0;
        }

        StringBuilder digits = new StringBuilder();
        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        if (digits.length() == 0) {
            return 0;
        }
        return Integer.parseInt(digits.toString());
    }

    public static void main(String[] args) {
        System.out.println(filterDigits("verff151689"));
        System.out.println(filterDigits("dfvv6841"));
        System.out.println(filterDigits("cfvfv"));
        System.out.println(filterDigits("fvs4898"));
    }
}
