package org.ahmetaksunger;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Ahmet", "Aksunger", "Istanbul", "123456789");
        Restaurant restaurant = new Restaurant("Ahmet", "Aksunger", "Istanbul", "123456789");
        Company company = new Company("Ahmet", "Aksunger", "Istanbul", "123456789");

        InsuranceMailingVisitor visitor = new InsuranceMailingVisitor();
        visitor.sendAllMails(bank, restaurant, company);
    }
}
