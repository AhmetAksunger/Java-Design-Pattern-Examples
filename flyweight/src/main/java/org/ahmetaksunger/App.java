package org.ahmetaksunger;

import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {

        MovingParticle movingParticle = MovingParticleFactory.getParticle(
                new Particle.Skin("red", "smooth", "circle"),
                10,
                new MovingParticle.Vector(1, 1),
                new MovingParticle.Coordinate(0, 0));

        MovingParticle movingParticle2 = MovingParticleFactory.getParticle
                (new Particle.Skin("red", "smooth", "circle"),
                10,
                new MovingParticle.Vector(10, 10),
                new MovingParticle.Coordinate(10, 5));

        logger.info(String.valueOf(movingParticle.getSkin().hashCode()));
        logger.info(String.valueOf(movingParticle2.getSkin().hashCode()));

    }
}
