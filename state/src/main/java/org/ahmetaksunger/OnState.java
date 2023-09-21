package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OnState extends State {
    public OnState(Phone phone) {
        super(phone);
    }

    @Override
    public void onHomeButton() {
        log.info("Phone is already open");
    }

    @Override
    public void onPowerButton() {
        phone.setState(new OffState(phone));
        log.info("Phone is off");
    }
}
