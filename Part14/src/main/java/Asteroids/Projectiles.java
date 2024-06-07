package Asteroids;

import javafx.scene.shape.Polygon;

import java.util.ArrayList;
import java.util.List;

public class Projectiles extends Character{
    public Projectiles(int x, int y) {
        super(new Polygon(5, -5, 5, 5, -5, 5, -5, -5), x, y);

    }
}
