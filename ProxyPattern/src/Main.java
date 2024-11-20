// Pseudo-code
// Class: Client
// Demonstrates the use of ProxyInternet to access websites

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("example.com"); // Allowed site
            internet.connectTo("abc.com");    // Banned site
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
