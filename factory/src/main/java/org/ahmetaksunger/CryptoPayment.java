package org.ahmetaksunger;

import java.math.BigDecimal;

class CryptoPayment implements PaymentMethod{
    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Withdrawing " + amount + " from Crypto");
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Depositing " + amount + " from Crypto");
    }
}
