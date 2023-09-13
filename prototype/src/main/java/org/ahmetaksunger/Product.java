package org.ahmetaksunger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class Product implements Prototype<Product> {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private Set<Category> categories;

    // Deep Copy
    private Product(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.description = product.description;
        this.price = product.price;
        this.stockQuantity = product.stockQuantity;
        this.categories = product.categories.stream().map(Category::clone).collect(Collectors.toSet());
    }

    @Override
    public Product clone() {
        return new Product(this);
    }
}
