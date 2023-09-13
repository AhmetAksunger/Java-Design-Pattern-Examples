package org.ahmetaksunger;

import java.math.BigDecimal;

class PaypalPayment implements PaymentMethod {
    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Withdrawing " + amount + " from Paypal");
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Withdrawing " + amount + " from Paypal");
    }
}
