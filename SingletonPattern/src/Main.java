// Step 6: Create a demo class to test the Singleton pattern/
public class Main {
    public static void main(String[] args) {
        // Step 7: Get the only object available from the Singleton class
        Singleton singletonInstance = Singleton.getInstance();

        // Step 8: Call the method on the singleton instance
        singletonInstance.showMessage();    // Output: Hello World! This is a singleton instance.
    }
}