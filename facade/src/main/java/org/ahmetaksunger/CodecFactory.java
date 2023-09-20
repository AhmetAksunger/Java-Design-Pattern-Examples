package org.ahmetaksunger;

public class CodecFactory {

    private CodecFactory() {
    }

    public static Codec getCodec(String type) {
        if (type.equals("mp4")) {
            return new Mp4Codec();
        } else if (type.equals("vlc")) {
            return new VlcCodec();
        } else {
            throw new IllegalArgumentException("Codec type is not supported");
        }
    }
}
