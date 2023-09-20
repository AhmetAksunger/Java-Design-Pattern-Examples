package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AudioFix {

    public Video fix(Video video) {
        log.info("Fixing audio of {} video", video.getName());
        return video;
    }

}
