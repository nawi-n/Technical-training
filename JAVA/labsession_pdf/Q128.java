import java.util.regex.*;

public class Q128 {

    public static boolean isValidEmail(String s) {

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("example@example.com"));
        System.out.println(isValidEmail("invalid-email@.com"));
        System.out.println(isValidEmail("another@domain"));
        System.out.println(isValidEmail("user@domain.co.in"));
        System.out.println(isValidEmail("name with space@email.com"));
    }
}
