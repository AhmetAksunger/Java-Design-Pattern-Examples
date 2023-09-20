package org.ahmetaksunger;

public interface Iterator<T> {

    int index = 0;

    boolean hasNext();

    T next();

    void reset();
}
