package org.ahmetaksunger.app;

import org.ahmetaksunger.ObjectPool;
import org.ahmetaksunger.Product;
import org.ahmetaksunger.ProductPool;

import java.util.logging.Logger;

/**
 * Object pool is used to work with objects that are expensive to initiate.
 */
public class App {
    public static void main(String[] args) {
        ObjectPool<Product> productPool = new ProductPool();

        Product product1 = productPool.checkOut();

        // use product, then return it back to the pool

        productPool.checkIn(product1);
        productPool.getPoolInformation();
    }
}
