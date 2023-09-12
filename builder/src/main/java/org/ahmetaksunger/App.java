package org.ahmetaksunger;

import java.math.BigDecimal;
import java.util.Set;

public class App {
    public static void main(String... args) {

        Category category1 = new Category.Builder()
                .id(1L)
                .name("Technology")
                .description("A category representing the technology products")
                .build();

        Category category2 = new Category.Builder()
                .withRandomFields()
                .build();

        Product product = new Product.Builder()
                .withId(1L)
                .withName("Casper Laptop")
                .withDescription("A laptop with 16 GB rams")
                .withStockQuantity(100)
                .withPrice(BigDecimal.TEN)
                .withCategories(Set.of(category1,category2))
                .build();
    }
}
