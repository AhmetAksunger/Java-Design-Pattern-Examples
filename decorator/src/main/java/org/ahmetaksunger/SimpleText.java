package org.ahmetaksunger;

public class SimpleText implements Text{

    private final String content;
    private final String author;

    public SimpleText(String content, String author) {
        this.content = content;
        this.author = author;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
