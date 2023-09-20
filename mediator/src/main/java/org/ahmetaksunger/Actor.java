package org.ahmetaksunger;

public interface Actor {

    void sendMessage(String topic, String message);

    void receiveMessage(String message);

}
