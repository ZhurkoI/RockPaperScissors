package org.zhurko.rockpaperscissors;

import java.util.Random;

class Computer {

    private final Random random = new Random();

    public Shape getShape() {
        Shape[] shapes = Shape.values();

        int index = random.nextInt(shapes.length);
        return shapes[index];
    }
}
