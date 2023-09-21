package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OffState extends State{
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public void onHomeButton() {
        phone.setState(new LockedState(phone));
        log.info("Phone is locked");
    }

    @Override
    public void onPowerButton() {
        phone.setState(new LockedState(phone));
        log.info("Phone is locked");
    }
}
