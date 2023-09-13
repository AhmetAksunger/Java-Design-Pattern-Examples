package org.ahmetaksunger;

import java.math.BigDecimal;

class CreditCardPayment implements PaymentMethod {
    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Withdrawing " + amount + " from CreditCard");
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Depositing " + amount + " from CreditCard");
    }
}
