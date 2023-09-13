package org.ahmetaksunger;

import java.math.BigDecimal;
import java.util.Set;
import java.util.logging.Logger;


public class App {

    private static final Logger logger = Logger.getLogger("");

    public static void main(String[] args) {

        Category category = Category.builder()
                .id(1L)
                .name("Technology")
                .description("A category representing the technology products")
                .build();

        Product product = Product.builder()
                .id(1L)
                .name("Product")
                .description("Description")
                .price(BigDecimal.TEN)
                .stockQuantity(100)
                .categories(Set.of(category))
                .build();

        Product productClone = product.clone();

        logger.info(product.toString());
        logger.info(productClone.toString());
    }
}
