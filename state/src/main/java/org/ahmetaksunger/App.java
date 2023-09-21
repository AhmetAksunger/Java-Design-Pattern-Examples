package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.printCurrentState();
        phone.getState().onPowerButton();
        phone.getState().onHomeButton();
        phone.getState().onPowerButton();
    }
}
