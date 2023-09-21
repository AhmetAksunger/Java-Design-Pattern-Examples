package org.ahmetaksunger;

public class App {
    public static void main(String[] args) {
        DataProcessor fileDataProcessor = new FileDataProcessor();
        fileDataProcessor.process();

        DataProcessor databaseProcessor = new DatabaseProcessor();
        databaseProcessor.process();
    }
}
