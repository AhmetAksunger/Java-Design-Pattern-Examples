package org.ahmetaksunger;

public class BitReader {
    public Video convert(Video video, Codec codec) {
        codec.decode(video);
        return video;
    }
}
