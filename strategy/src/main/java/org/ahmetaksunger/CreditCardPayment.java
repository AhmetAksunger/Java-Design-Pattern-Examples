package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(BigDecimal amount) {
        log.info("Paying {} using Credit Card", amount);
    }

    @Override
    public PaymentStrategyType type() {
        return PaymentStrategyType.CREDIT_CARD;
    }
}
