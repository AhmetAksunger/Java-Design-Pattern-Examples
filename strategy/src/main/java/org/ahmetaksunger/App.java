package org.ahmetaksunger;

import java.math.BigDecimal;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService(
                Set.of(
                        new PaypalPayment(),
                        new CreditCardPayment(),
                        new CryptoPayment()
                )
        );

        paymentService.pay(PaymentStrategyType.PAYPAL, BigDecimal.valueOf(100));
        paymentService.pay(PaymentStrategyType.CREDIT_CARD, BigDecimal.valueOf(100));
        paymentService.pay(PaymentStrategyType.CRYPTOCURRENCY, BigDecimal.valueOf(100));
    }
}
