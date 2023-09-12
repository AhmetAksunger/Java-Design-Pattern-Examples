package org.ahmetaksunger;

public class Category {
    private final Long id;
    private String name;
    private String description;

    private Category(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String description;

        public Builder withRandomFields() {
            return this
                    .id(1L)
                    .name("Random Category")
                    .description("A random category representing the random category products");
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Category build() {
            return new Category(id, name, description);
        }

    }
}
