// Example of how to use the adapter
public class Client {
    private INewPayment paymentProcessor;

    public Client(INewPayment paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processClientPayment(double amount, String currency) {
        // Client works with the new interface, unaware of the legacy system
        boolean success = paymentProcessor.processPayment(amount, currency);
        if (success) {
            // Handle successful payment
            System.out.println("Payment processed successfully");
        } else {
            // Handle failed payment
            System.out.println("Payment processing failed");
        }
    }
}