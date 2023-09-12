package org.ahmetaksunger;

import java.math.BigDecimal;
import java.util.Set;

public class Product {

    private final Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private Set<Category> categories;

    private Product(Long id, String name, String description, BigDecimal price, Integer stockQuantity, Set<Category> categories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.categories = categories;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String description;
        private BigDecimal price;
        private Integer stockQuantity;
        private Set<Category> categories;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder withStockQuantity(Integer stockQuantity) {
            this.stockQuantity = stockQuantity;
            return this;
        }

        public Builder withCategories(Set<Category> categories) {
            this.categories = categories;
            return this;
        }

        public Product build() {
            return new Product(id, name, description, price, stockQuantity, categories);
        }
    }
}
