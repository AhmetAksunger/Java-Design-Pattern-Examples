package org.ahmetaksunger;

import lombok.Getter;
import lombok.Setter;

public class MovingParticle extends Particle {

    public MovingParticle(Skin skin, int speed, Vector vector, Coordinate coordinate) {
        super(skin, speed);
        this.vector = vector;
        this.coordinate = coordinate;
    }

    private Vector vector;
    private Coordinate coordinate;

    @Getter
    public static class Coordinate {
        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    @Getter
    @Setter
    public static class Vector {
        private int x;
        private int y;

        public Vector(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
