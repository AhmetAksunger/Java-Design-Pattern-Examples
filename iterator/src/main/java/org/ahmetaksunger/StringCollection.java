package org.ahmetaksunger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCollection implements Container<String> {

    private List<String> stringList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

    public void add(String s) {
        stringList.add(s);
    }

    public void remove(String s) {
        stringList.remove(s);
    }

    @Override
    public Iterator<String> getIterator() {
        return new StringCollectionIterator(stringList);
    }
}
