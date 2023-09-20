package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {

        Channel channel = new AtvChannel();
        Channel channel2 = new FoxChannel();

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addObserver(channel,channel2);

        newsAgency.setNews("News 1");
        channel.printNews();
        channel2.printNews();
    }
}
