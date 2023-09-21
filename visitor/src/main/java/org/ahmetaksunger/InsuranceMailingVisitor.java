package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class InsuranceMailingVisitor implements Visitor {

    public void sendAllMails(Client... clients) {
        Arrays.stream(clients).forEach(client -> client.sendMail(this));
    }

    @Override
    public void visit(Bank bank) {
        log.info("Sending insurance mail to bank: {}", bank.toString());
    }

    @Override
    public void visit(Restaurant restaurant) {
        log.info("Sending insurance mail to restaurant: {}", restaurant);
    }

    @Override
    public void visit(Company company) {
        log.info("Sending insurance mail to company: {}", company);
    }
}
