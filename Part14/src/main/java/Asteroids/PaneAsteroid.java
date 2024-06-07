package Asteroids;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.util.*;
import java.util.stream.Collectors;

public class PaneAsteroid extends Application {
    public static int width = 600;
    public static int height = 200;

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {

        //creating pane/base why pane? because it has a list of type observableList which can be useful to show arbitrary amount of objects
        Pane asteroidPane = new Pane();
        asteroidPane.setPrefSize(width, height);
        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();

        Ship ship01 = new Ship(width / 2, height / 2);

        ArrayList<Asteroid> asteroids = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            Asteroid asteroid = new Asteroid(rnd.nextInt(width / 3), rnd.nextInt(100));
            asteroids.add(asteroid);
        }
        asteroids.forEach(event -> {
            event.turnLeft();
            event.turnRight();
            event.accelerate();
        });
        //adding projectiles
        List<Projectiles> projectilesList = new ArrayList<>();


        //adding ship and asteroids to the pane
        asteroidPane.getChildren().add(ship01.getcharacter());
        asteroids.forEach(event -> {
            asteroidPane.getChildren().add(event.getcharacter());
        });
        //creating scene
        Scene asteroidsScene = new Scene(asteroidPane);

        //movement

        asteroidsScene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });
        asteroidsScene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });

        //Listening to the keyboard


        new AnimationTimer() {

            @Override
            public void handle(long now) {
                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    ship01.turnLeft();
                }

                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    ship01.turnRight();
                }
                if (pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    ship01.accelerate();
                }
                if (pressedKeys.getOrDefault(KeyCode.SPACE, false) && projectilesList.size() < 3) {
                    // we shoot
                    Projectiles projectile = new Projectiles((int) ship01.getcharacter().getTranslateX(), (int) ship01.getcharacter().getTranslateY());
                    projectile.getcharacter().setRotate(ship01.getcharacter().getRotate());
                    projectilesList.add(projectile);
                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));

                    asteroidPane.getChildren().add(projectile.getcharacter());
                }
                projectilesList.forEach(projectile -> {
                    List<Asteroid> collisions = asteroids.stream()
                            .filter(asteroid -> asteroid.collide(projectile))
                            .collect(Collectors.toList());

                    collisions.stream().forEach(collided -> {
                        asteroids.remove(collided);
                        asteroidPane.getChildren().remove(collided.getcharacter());
                    });
                });
                ship01.move();
                projectilesList.forEach(projectile -> {
                    projectile.move();
                });
                asteroids.forEach(asteroid -> asteroid.move());
                asteroids.forEach(asteroid -> {
                    if (ship01.collide(asteroid)) {
                        stop();
                    }
                });
            }
        }.start();


        stage.setTitle("Asteroids!");
        stage.setScene(asteroidsScene);
        stage.show();


    }
}
