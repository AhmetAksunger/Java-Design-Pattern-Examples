package org.ahmetaksunger;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.Set;

@Builder
@AllArgsConstructor
public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private Set<Category> categories;
}
