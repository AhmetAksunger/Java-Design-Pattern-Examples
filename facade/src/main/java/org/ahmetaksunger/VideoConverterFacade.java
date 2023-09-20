package org.ahmetaksunger;

public class VideoConverterFacade {

    public Video convertVideo(String fileName) {
        Video video = new Video(fileName);
        Codec codec = CodecFactory.getCodec(video.getCodecType());
        BitReader bitReader = new BitReader();
        Video decodedVideo = bitReader.convert(video, codec);
        AudioFix audioFix = new AudioFix();
        return audioFix.fix(decodedVideo);
    }

}
