public class Logger {

    // Step 2: Private static instance of Logger (eager initialization)
    private static Logger instance = new Logger();

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 2: Public static method to get the single instance
    public static Logger getInstance() {
        return instance;
    }

    // A sample method for logging
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
