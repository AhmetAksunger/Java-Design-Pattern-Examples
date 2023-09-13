package org.ahmetaksunger;

import java.math.BigDecimal;
import java.util.Set;

public class ProductPool extends ObjectPool<Product> {
    @Override
    protected Product create() {

        Category category1 = Category.builder()
                .id(1L)
                .name("Category 1")
                .description("Description")
                .build();
        Category category2 = Category.builder()
                .id(2L)
                .name("Category 2")
                .description("Description")
                .build();
        Category category3 = Category.builder()
                .id(3L)
                .name("Category 3")
                .description("Description")
                .build();

        return Product.builder()
                .id(1L)
                .name("Name")
                .description("Description")
                .stockQuantity(100)
                .price(BigDecimal.TEN)
                .categories(Set.of(category1, category2, category3))
                .build();
    }
}
