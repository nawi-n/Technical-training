import java.util.regex.*;

public class Q129 {
    public static boolean isValidURL(String s) {
        String regex = "^(https?|ftp)://"
                + "(([A-Za-z0-9-]+\\.)+[A-Za-z]{2,}|"
                + "localhost|"
                + "((\\d{1,3}\\.){3}\\d{1,3}))"
                + "(:\\d{1,5})?"
                + "(/[^\\s]*)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidURL("http://example.com"));
        System.out.println(isValidURL("https://www.example.com:8080/path/to/resource?query=param#fragment"));
        System.out.println(isValidURL("ftp://ftp.example.com/file.txt"));
        System.out.println(isValidURL("http://example"));
        System.out.println(isValidURL("https://www.example.com:8080/path/to/resource?query=param#"));
        System.out.println(isValidURL("ftp://:8080/file.txt"));
    }
}
