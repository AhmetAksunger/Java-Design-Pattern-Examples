package org.ahmetaksunger;

import java.util.ArrayList;
import java.util.List;

public class MovingParticleFactory {

    private static List<Particle> particles = new ArrayList<>();

    public static MovingParticle getParticle(Particle.Skin skin, int speed,
                                      MovingParticle.Vector vector, MovingParticle.Coordinate coordinate) {

        Particle particle = particles.stream()
                .filter(p -> p.getSkin().equals(skin) && p.getSpeed() == speed)
                .findFirst()
                .orElseGet(() -> {
                    Particle p = new Particle(skin, speed);
                    particles.add(p);
                    return p;
                });

        return new MovingParticle(particle.getSkin(), particle.getSpeed(), vector, coordinate);

    }

}
