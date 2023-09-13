package org.ahmetaksunger;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class Category {
    private Long id;
    private String name;
    private String description;
}
