package org.ahmetaksunger;

public class PaymentMethodFactory {

    private PaymentMethodFactory() {
    }

    public static PaymentMethod getInstance(PaymentType paymentType) {
        return switch (paymentType) {
            case CREDIT_CARD -> new CreditCardPayment();
            case CRYPTO -> new CryptoPayment();
            case PAYPAL -> new PaypalPayment();
        };
    }

    public enum PaymentType {
        CREDIT_CARD,
        CRYPTO,
        PAYPAL
    }
}
