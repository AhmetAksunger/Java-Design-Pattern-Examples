package org.ahmetaksunger;

import lombok.ToString;

@ToString
public class Radio implements Device {

    private static final Double MAX_CHANNEL_FREQUENCY = 108.0;

    private Integer volume = 50;
    private Boolean on = false;
    private Double frequency = 88.5;

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
        return this.frequency;
    }

    @Override
    public void setChannel(Double frequency) {
        if (frequency > MAX_CHANNEL_FREQUENCY) {
            this.frequency = MAX_CHANNEL_FREQUENCY;
        }
        if (frequency < 0D) {
            this.frequency = 0.0;
        }
        this.frequency = frequency;
    }

    @Override
    public void printStatus() {
        logger.info(toString());
    }
}
