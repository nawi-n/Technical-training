public class Q36_MagicNumber {
    static boolean isMagicNumber(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        int reversed = Integer.parseInt(new StringBuilder(String.valueOf(sum)).reverse().toString());
        return sum * reversed == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(isMagicNumber(n) ? "Yes" : "No");
    }
}