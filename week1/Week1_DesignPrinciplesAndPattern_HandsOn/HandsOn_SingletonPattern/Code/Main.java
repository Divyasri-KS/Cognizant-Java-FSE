public class Main {
    public static void main(String[] args) {
        // Get the first instance
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        // Get the second instance
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton verified).");
        } else {
            System.out.println("Different instances (Singleton violated).");
        }
    }
}
