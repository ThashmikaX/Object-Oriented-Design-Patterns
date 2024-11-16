// Example usage of the adapter pattern
public class Main {
    public static void main(String[] args) {
        // Create adapter that wraps the legacy system
        INewPayment paymentAdapter = new PaymentSystemAdapter();

        // Create client with the adapter
        Client client = new Client(paymentAdapter);

        // Process payment using new interface
        client.processClientPayment(99.99, "USD");

        // Check payment status
        String status = paymentAdapter.getPaymentStatus("12345");
        System.out.println("Payment status: " + status);
    }
}