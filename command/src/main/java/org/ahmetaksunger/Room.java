package org.ahmetaksunger;

public class Room {
    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
