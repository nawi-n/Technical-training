public class Q109 {
    public static void main(String[] args) {
        int number = 12322;
        boolean result = isPalindrome(number);
        System.out.println("Is the number " + number + " a palindrome? " + result);
    }

    static boolean isPalindrome(int number) {
        int temp = number;
        int reversed = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return number == reversed;
    }
}
