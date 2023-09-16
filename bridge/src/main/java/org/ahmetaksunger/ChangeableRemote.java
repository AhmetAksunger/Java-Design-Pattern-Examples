package org.ahmetaksunger;

public class ChangeableRemote extends AbstractRemote{

    public ChangeableRemote(Device device) {
        super(device);
    }

    public void changeDevice(Device device){
        this.device = device;
    }

}
