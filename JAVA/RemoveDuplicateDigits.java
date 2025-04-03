import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateDigits {
    public static int removeDuplicates(int num) {
        String numStr = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();

        for (char digit : numStr.toCharArray()) {
            if (!seen.contains(digit)) {
                seen.add(digit);
                result.append(digit);
            }
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int uniqueNum = removeDuplicates(num);
        System.out.println("Number after removing duplicate digits: " + uniqueNum);

        scanner.close();
    }
}


/*

import java.util.Scanner;

public class RemoveDuplicateDigits {
    public static int removeDuplicates(int num) {
        String numStr = Integer.toString(num);
        String result = "";

        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            
            // Only add the digit if it's not already in result
            if (result.indexOf(digit) == -1) { 
                result += digit;
            }
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int uniqueNum = removeDuplicates(num);
        System.out.println("Number after removing duplicate digits: " + uniqueNum);

        scanner.close();
    }
}

 */
