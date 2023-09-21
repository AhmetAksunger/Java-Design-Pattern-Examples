package org.ahmetaksunger;

public abstract class State {
    protected final Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract void onHomeButton();

    public abstract void onPowerButton();
}
