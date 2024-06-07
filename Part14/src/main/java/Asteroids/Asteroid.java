package Asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;

import java.util.Random;

public class Asteroid extends Character {
    private double rotationalMovement;

    public Asteroid(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);
        Random rnd = new Random();


        //rotates the asteroids round n round(SCATTERS THEM AROUND)
        super.getcharacter().setRotate(rnd.nextInt(360));

        int accelerationAmount = 1 + rnd.nextInt(10);
        for (int i = 0; i < accelerationAmount; i++) {
            accelerate();
        }
        this.rotationalMovement = 0.5 - rnd.nextDouble();
    }

    public void move() {
        super.move();
        //rotation while moving
        super.getcharacter().setRotate(super.getcharacter().getRotate() + rotationalMovement);
    }

}
