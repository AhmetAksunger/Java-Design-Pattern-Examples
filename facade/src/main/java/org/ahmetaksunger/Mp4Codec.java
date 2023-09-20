package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mp4Codec extends Codec {
    private String type = "mp4";

    @Override
    public void decode(Video video) {
        log.info("Decoding {} using {} codec", video.getName(), type);
    }
}
