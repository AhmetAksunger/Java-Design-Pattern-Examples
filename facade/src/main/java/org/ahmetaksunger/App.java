package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        Video video = videoConverterFacade.convertVideo("funny-cats-video.mp4");
    }
}
