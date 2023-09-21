package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileDataProcessor extends DataProcessor {

    @Override
    protected void loadData() {
        log.info("Loading data from file...");
    }

    @Override
    protected void parseData() {
        log.info("Parsing data from file...");
    }

    @Override
    protected void transformData() {
        log.info("Transforming data from file...");
    }

    @Override
    protected void saveData() {
        log.info("Saving the transformed data into the file...");
    }
}
