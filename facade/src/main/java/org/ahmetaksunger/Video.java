package org.ahmetaksunger;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Video {
    private String name;
    private String codecType;

    public Video(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }
}
