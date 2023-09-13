package org.ahmetaksunger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class Category implements Prototype<Category>{
    private Long id;
    private String name;
    private String description;

    private Category(Category category){
        this.id = category.id;
        this.name = category.name;
        this.description = category.description;
    }

    @Override
    public Category clone() {
        return new Category(this);
    }

}
