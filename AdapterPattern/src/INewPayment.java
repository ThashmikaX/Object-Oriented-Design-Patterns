// Interface for the new payment system that the client expects to use
public interface INewPayment {
    boolean processPayment(double amount, String currency);
    String getPaymentStatus(String transactionId);
}