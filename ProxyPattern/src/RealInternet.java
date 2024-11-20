// Pseudo-code
// Class: RealInternet
// Implements the Internet interface to provide actual internet access

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}
