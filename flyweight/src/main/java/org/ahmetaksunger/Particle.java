package org.ahmetaksunger;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
public class Particle {

    //create constructor
    public Particle(Skin skin, int speed) {
        this.skin = skin;
        this.speed = speed;
    }

    private Skin skin;
    private int speed;

    @EqualsAndHashCode
    public static class Skin {
        private String color;
        private String texture;
        private String shape;

        public Skin(String color, String texture, String shape) {
            this.color = color;
            this.texture = texture;
            this.shape = shape;
        }
    }

}
