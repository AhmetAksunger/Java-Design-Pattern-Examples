package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {

        Device radio = new Radio();
        Device tv = new Television();
        Device tv2 = new Television();

        AdvancedRemote advancedRemoteForRadio = new AdvancedRemote(radio);
        AdvancedRemote advancedRemoteForTelevision = new AdvancedRemote(tv);
        ChangeableRemote changeableRemote = new ChangeableRemote(tv2);

        radio.printStatus();
        advancedRemoteForRadio.power();
        advancedRemoteForRadio.channelDown(10.5);
        advancedRemoteForRadio.volumeUp(32);
        radio.printStatus();

        tv.printStatus();
        advancedRemoteForTelevision.power();
        advancedRemoteForTelevision.mute();
        tv.printStatus();

        tv2.printStatus();
        changeableRemote.power();
        tv2.printStatus();
        changeableRemote.changeDevice(radio);
        changeableRemote.power();
        radio.printStatus();
    }
}
