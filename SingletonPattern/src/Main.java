public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Verify both references point to the same instance
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
