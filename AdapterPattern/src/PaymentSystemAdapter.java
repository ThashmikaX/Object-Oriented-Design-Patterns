import java.util.Map;

// Adapter class that makes the LegacyPaymentSystem work with INewPayment interface
public class PaymentSystemAdapter implements INewPayment {
    private LegacyPaymentSystem legacySystem;
    private Map<String, Integer> currencyCodeMap;

    public PaymentSystemAdapter() {
        this.legacySystem = new LegacyPaymentSystem();
        initializeCurrencyCodeMap();
    }

    private void initializeCurrencyCodeMap() {
        // Pseudo: Initialize mapping between currency strings and legacy codes
        // currencyCodeMap.put("USD", 840);
        // currencyCodeMap.put("EUR", 978);
        // currencyCodeMap.put("GBP", 826);
    }

    @Override
    public boolean processPayment(double amount, String currency) {
        try {
            // Pseudo steps:
            // 1. Convert double amount to float
            float legacyAmount = (float) amount;

            // 2. Convert currency string to legacy code
            int legacyCurrencyCode = currencyCodeMap.get(currency);

            // 3. Call legacy system with converted parameters
            int transactionId = legacySystem.makePayment(legacyAmount, legacyCurrencyCode);

            // 4. Convert response to new interface format
            return transactionId > 0;

        } catch (Exception e) {
            // Handle conversion errors
            return false;
        }
    }

    @Override
    public String getPaymentStatus(String transactionId) {
        try {
            // Pseudo steps:
            // 1. Convert string transaction ID to integer
            int legacyTransactionId = Integer.parseInt(transactionId);

            // 2. Get status from legacy system
            boolean legacyStatus = legacySystem.checkPaymentStatus(legacyTransactionId);

            // 3. Convert boolean status to string format
            return legacyStatus ? "COMPLETED" : "FAILED";

        } catch (Exception e) {
            return "ERROR";
        }
    }
}