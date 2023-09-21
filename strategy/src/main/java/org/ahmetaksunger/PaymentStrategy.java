package org.ahmetaksunger;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void pay(BigDecimal amount);
    PaymentStrategyType type();

}
