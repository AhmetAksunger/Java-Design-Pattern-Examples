package org.ahmetaksunger;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public abstract class ObjectPool<T> {

    private Logger logger = Logger.getLogger("Pool Logger");

    /**
     * Represents the available objects
     */
    private Set<T> available = new HashSet<>();

    /**
     * Represents the used objects
     */
    private Set<T> inUse = new HashSet<>();

    protected abstract T create();

    /**
     * Retrieves an object from the pool
     *
     * @return {@link T} object
     */
    public T checkOut() {
        if (available.isEmpty()) {
            available.add(create());
        }
        T object = available.iterator().next();
        available.remove(object);
        inUse.add(object);
        return object;
    }

    /**
     * Returns the object back to the pool
     *
     * @param object {@link T} object
     */
    public void checkIn(T object) {
        inUse.remove(object);
        available.add(object);
    }

    public String getPoolInformation() {
        String availableSizeText = String.format("Available object amount: %d", available.size());
        String inUseSizeText = String.format("In use object amount: %d", inUse.size());
        String information = availableSizeText + "\n" + inUseSizeText;
        logger.info(information);
        return information;
    }

    @Override
    public String toString() {
        return getPoolInformation();
    }
}
