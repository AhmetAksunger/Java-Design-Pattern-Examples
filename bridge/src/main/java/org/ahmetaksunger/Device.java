package org.ahmetaksunger;

import java.util.logging.Logger;

public interface Device {
    Logger logger = Logger.getLogger("DeviceLogger");

    Boolean isEnabled();

    void enable();

    void disable();

    Integer getVolume();

    void setVolume(Integer volume);

    Double getChannel();

    void setChannel(Double frequency);

    void printStatus();
}

