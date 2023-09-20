package org.ahmetaksunger;

public class VlcCodec extends Codec{
    private String type = "vlc";

    @Override
    public void decode(Video video) {
        System.out.println("Decoding " + video.getName() + " using " + type + " codec");
    }
}
