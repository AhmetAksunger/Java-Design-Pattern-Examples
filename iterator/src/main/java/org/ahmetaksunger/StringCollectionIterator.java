package org.ahmetaksunger;

import java.util.List;

public class StringCollectionIterator implements Iterator<String> {

    private List<String> stringList;
    private int index = 0;

    public StringCollectionIterator(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public boolean hasNext() {
        if (index < stringList.size()) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        String next = stringList.get(index);
        index++;
        return next;
    }

    @Override
    public void reset() {
        index = 0;
    }
}
