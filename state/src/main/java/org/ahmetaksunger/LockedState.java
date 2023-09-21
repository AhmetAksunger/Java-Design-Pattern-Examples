package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LockedState extends State{
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void onHomeButton() {
        phone.setState(new OnState(phone));
        log.info("Phone is unlocked");
    }

    @Override
    public void onPowerButton() {
        phone.setState(new OffState(phone));
        log.info("Phone is off");
    }
}
