// Step 1: Create a Singleton class
public class Singleton {
    // Step 2: Create a privat static instance of class
    private static Singleton instance = new Singleton();

    // Step 3: Make the constructor private so that this class cannot be instantiated from outside
    private Singleton(){}

    // Step 4: Provide a public static method to get the instance of the class
    public static Singleton getInstance(){
        return instance;
    }

    // Step 5: Add a method to demonstrate functionality
    public void showMessage(){
        System.out.println("Hello World! This is a singleton instance.");
    }
}
