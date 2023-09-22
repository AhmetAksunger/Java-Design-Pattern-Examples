package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwitchLightsCommand implements Command {

    private final Light light;

    public SwitchLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }

}
