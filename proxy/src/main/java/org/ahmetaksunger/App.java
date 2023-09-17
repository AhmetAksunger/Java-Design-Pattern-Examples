package org.ahmetaksunger;

/**
 * A proxy acts as an intermediary or wrapper for an object and
 * allows you to add extra functionality before or after the actual operation is performed on the real object.
 */
public class App {

    public static void main(String[] args) {

        YoutubeService youtubeService = new YoutubeCacheService(new YoutubeServiceImpl());

        System.out.println(youtubeService.getVideo("youtube.url"));
    }

}
