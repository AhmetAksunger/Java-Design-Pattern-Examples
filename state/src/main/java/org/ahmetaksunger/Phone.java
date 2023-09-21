package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Phone {
    private State state;

    public Phone() {
        state = new OffState(this);
    }

    public void printCurrentState(){
        log.info("Current state: {}", state.getClass().getSimpleName());
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
