package org.ahmetaksunger;

public interface Visitor {
    void visit(Bank bank);

    void visit(Restaurant restaurant);

    void visit(Company company);
}
