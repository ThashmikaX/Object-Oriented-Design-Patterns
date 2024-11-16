// This is the old/legacy payment system that needs to be adapted
// Pseudo: - Connects to old payment gateway
//        - Uses different method names and parameters
//        - Returns different response formats
public class LegacyPaymentSystem {
    public int makePayment(float amt, int currencyCode) {
        // Pseudo implementation:
        // 1. Format amount according to old system requirements
        // 2. Convert currency string to legacy currency codes
        // 3. Call legacy payment gateway API
        // 4. Return transaction ID as integer
        return 12345; // Example transaction ID
    }

    public boolean checkPaymentStatus(int transactionId) {
        // Pseudo implementation:
        // 1. Connect to legacy system
        // 2. Query status using old format
        // 3. Convert boolean response
        return true;
    }
}