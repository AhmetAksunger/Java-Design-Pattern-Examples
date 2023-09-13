package org.ahmetaksunger.app;

import org.ahmetaksunger.PaymentMethod;
import org.ahmetaksunger.PaymentMethodFactory;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        PaymentMethod paypal = PaymentMethodFactory.getInstance(PaymentMethodFactory.PaymentType.PAYPAL);
        PaymentMethod creditCard = PaymentMethodFactory.getInstance(PaymentMethodFactory.PaymentType.CREDIT_CARD);
        PaymentMethod crypto = PaymentMethodFactory.getInstance(PaymentMethodFactory.PaymentType.CRYPTO);

        creditCard.deposit(BigDecimal.TEN);
        paypal.withdraw(BigDecimal.ONE);
        crypto.deposit(BigDecimal.TEN);

    }
}
