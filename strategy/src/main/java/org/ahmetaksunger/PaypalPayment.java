package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class PaypalPayment implements PaymentStrategy{
    @Override
    public void pay(BigDecimal amount) {
      log.info("Paying {} using Paypal", amount);
    }

    @Override
    public PaymentStrategyType type() {
        return PaymentStrategyType.PAYPAL;
    }
}
