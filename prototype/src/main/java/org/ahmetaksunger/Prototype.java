package org.ahmetaksunger;

public interface Prototype<T> extends Cloneable {

    T clone();
}
