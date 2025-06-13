public class Q131 {
    public static void main(String[] args) {

        int count = args.length;
        System.out.println("Number of command line arguments passed: " + count);
        if (count > 0) {
            System.out.println("Arguments:");
            for (int i = 0; i < count; i++) {
                System.out.println("arg[" + i + "]: " + args[i]);
            }
        }
    }
}
