package org.ahmetaksunger;

import java.util.logging.Logger;

/**
 * Decorator pattern is a structural design pattern
 * that allows us to add new functionality to an existing object without altering its structure.
 */
public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {

        Text text = new SimpleText("Hello World!", "Ahmet Aksunger");
        logger.info(text.getContent());

        Text textWithFooter = new FooterDecorator(text, "Footer");
        logger.info(textWithFooter.getContent());

        Text textWithHeader = new HeaderDecorator(textWithFooter, "Header");
        logger.info(textWithHeader.getContent());

        Text boldText = new BoldDecorator(textWithHeader);
        logger.info(boldText.getContent());
    }
}
