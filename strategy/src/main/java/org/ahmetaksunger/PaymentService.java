package org.ahmetaksunger;

import java.math.BigDecimal;
import java.util.Set;

public class PaymentService {
    private final Set<PaymentStrategy> paymentStrategies;

    public PaymentService(Set<PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public void pay(PaymentStrategyType paymentStrategyType, BigDecimal amount) {
        PaymentStrategy paymentStrategy = findPaymentStrategy(paymentStrategyType);
        paymentStrategy.pay(amount);
    }

    private PaymentStrategy findPaymentStrategy(PaymentStrategyType paymentStrategyType) {
        return paymentStrategies.stream()
                .filter(paymentStrategy -> paymentStrategy.type().equals(paymentStrategyType))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Payment strategy not found"));
    }
}
