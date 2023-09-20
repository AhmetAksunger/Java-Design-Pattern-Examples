package org.ahmetaksunger;

public abstract class BaseAuthHandler {
    private BaseAuthHandler next;

    public abstract boolean handle(String username, String password);

    public BaseAuthHandler setNextHandler(BaseAuthHandler next) {
        this.next = next;
        return next;
    }

    public boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }

}

