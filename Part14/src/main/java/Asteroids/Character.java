package Asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class Character {

    private Polygon character;
    private Point2D movement;
    public  boolean isAlive;


    public Character(Polygon polygon, int x, int y) {
        this.character = polygon;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
        this.movement = new Point2D(0, 0);
        this.isAlive=true;
    }

    public Polygon getcharacter() {
        return this.character;
    }
    public void setAlive(boolean status){
        this.isAlive=status ;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void turnLeft() {
        this.character.setRotate(this.character.getRotate() - 5);
    }

    public void turnRight() {
        this.character.setRotate(this.character.getRotate() + 5);
    }

    public Point2D getMovement() {
        return this.movement;
    }

    public void setMovement(Point2D movement) {
        this.movement = movement;
    }

    public void move() {
        this.character.setTranslateX(this.character.getTranslateX() + this.movement.getX());
        this.character.setTranslateY(this.character.getTranslateY() + this.movement.getY());

        if (this.character.getTranslateX() < 0) {
            this.character.setTranslateX(this.character.getTranslateX() + PaneAsteroid.width);
        }
        if (this.character.getTranslateX() > PaneAsteroid.width) {
            this.character.setTranslateX(this.character.getTranslateX() % PaneAsteroid.width);
        }

        if (this.character.getTranslateY() < 0) {
            this.character.setTranslateY(this.character.getTranslateY() + PaneAsteroid.height);
        }
        if (this.character.getTranslateY() > PaneAsteroid.height) {
            this.character.setTranslateY(this.character.getTranslateY() % PaneAsteroid.height);
        }
    }

    public void accelerate() {
        double changeX = Math.cos(Math.toRadians(this.character.getRotate()));
        double changeY = Math.sin(Math.toRadians(this.character.getRotate()));

        this.movement = this.movement.add(changeX * 0.05, changeY * 0.05);
    }

    public boolean collide(Character other) {
        Shape collisionArea = Shape.intersect(this.character, other.getcharacter());
        return collisionArea.getBoundsInLocal().getWidth() != -1;
    }
}
