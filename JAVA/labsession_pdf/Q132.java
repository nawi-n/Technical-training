public class Q132 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer as a command line argument.");
            return;
        }

        try {

            int number = Integer.parseInt(args[0]);
            int square = number * number;
            System.out.println("The square of " + number + " is: " + square);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}
