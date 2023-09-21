package org.ahmetaksunger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class DataProcessor {

    protected abstract void loadData();
    protected abstract void parseData();
    protected abstract void transformData();
    protected abstract void saveData();

    public final void process() {
        loadData();
        parseData();
        transformData();
        saveData();
        log.info("Data processing finished.");
    }

}
