package org.ahmetaksunger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewsAgency {

    List<Channel> observers = new ArrayList<>();

    private String news;

    public void addObserver(Channel channel){
        observers.add(channel);
    }
    public void addObserver(Channel... channel){
        observers.addAll(Arrays.stream(channel).toList());
    }

    public void removeObserver(Channel channel){
        observers.remove(channel);
    }

    public void setNews(String news){
        this.news = news;
        observers.forEach(o -> o.update(news));
    }

}
