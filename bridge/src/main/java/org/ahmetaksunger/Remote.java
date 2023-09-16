package org.ahmetaksunger;

public interface Remote {

    void volumeUp(Integer volume);
    void volumeDown(Integer volume);
    void channelUp(Double frequency);
    void channelDown(Double frequency);
    void power();

}
