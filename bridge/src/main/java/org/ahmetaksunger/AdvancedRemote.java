package org.ahmetaksunger;

public class AdvancedRemote extends AbstractRemote{

    protected AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }

}
