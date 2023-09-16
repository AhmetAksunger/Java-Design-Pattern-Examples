package org.ahmetaksunger;

public abstract class AbstractRemote implements Remote {

    protected Device device;

    protected AbstractRemote(Device device){
        this.device = device;
    }

    @Override
    public void volumeUp(Integer volume) {
        device.setVolume(device.getVolume() + volume);
    }

    @Override
    public void volumeDown(Integer volume) {
        device.setVolume(device.getVolume() - volume);
    }

    @Override
    public void channelUp(Double frequency) {
        device.setChannel(device.getChannel() + frequency);
    }

    @Override
    public void channelDown(Double frequency) {
        device.setChannel(device.getChannel() - frequency);
    }

    @Override
    public void power() {
        if (device.isEnabled())
            device.disable();
        else
            device.enable();
    }

}
