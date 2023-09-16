package org.ahmetaksunger;

import lombok.ToString;

@ToString
public class Television implements Device {

    private static final Double MAX_CHANNEL_FREQUENCY = 200.0;

    private Integer volume = 60;
    private Boolean on = true;
    private Double channel = 133.3;

    @Override
    public Boolean isEnabled() {
        return this.on;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public Integer getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(Integer volume) {
        if (volume < 0) {
            this.volume = 0;
        }
        if (volume > 100) {
            this.volume = 100;
        }
        this.volume = volume;
    }

    @Override
    public Double getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(Double frequency) {
        if (frequency > MAX_CHANNEL_FREQUENCY) {
            this.channel = MAX_CHANNEL_FREQUENCY;
        }
        if (frequency < 0D) {
            this.channel = 0.0;
        }
    }

    @Override
    public void printStatus() {
        logger.info(toString());
    }
}
