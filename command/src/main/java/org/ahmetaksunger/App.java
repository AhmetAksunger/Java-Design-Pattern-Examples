package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {

        Room livingRoom = new LivingRoom();
        livingRoom.setCommand(new SwitchLightsCommand(new Light()));

        livingRoom.executeCommand();

    }
}
