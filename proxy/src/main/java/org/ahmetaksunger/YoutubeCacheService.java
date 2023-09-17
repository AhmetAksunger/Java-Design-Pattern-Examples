package org.ahmetaksunger;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class YoutubeCacheService implements YoutubeService {

    private final YoutubeService youtubeService;

    private static final Map<String, Video> caches = new HashMap<>();

    @Override
    public Video getVideo(String url) {

        if (caches.containsKey(url)) {
            return caches.get(url);
        }

        var video = youtubeService.getVideo(url);
        caches.put(url, video);

        return video;
    }
}
