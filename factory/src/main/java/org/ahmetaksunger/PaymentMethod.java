package org.ahmetaksunger;

import java.math.BigDecimal;

public interface PaymentMethod {

    void withdraw(BigDecimal amount);

    void deposit(BigDecimal amount);

}
