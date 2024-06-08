package Asteroids;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class PaneAsteroid extends Application {
    public static int width = 600;
    public static int height = 600;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Pane asteroidPane = new Pane();
        asteroidPane.setPrefSize(width, height);

        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();
        ArrayList<Asteroid> asteroids = new ArrayList<>();
        List<Projectiles> projectilesList = new ArrayList<>();

        Text text = new Text(10, 20, "Points: 0");
        AtomicInteger points = new AtomicInteger();
        asteroidPane.getChildren().add(text);

        Ship ship01 = new Ship(width / 2, height / 2);
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

        asteroidPane.getChildren().add(ship01.getcharacter());
        asteroids.forEach(event -> {
            asteroidPane.getChildren().add(event.getcharacter());
        });

        Scene asteroidsScene = new Scene(asteroidPane);

        asteroidsScene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });
        asteroidsScene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });

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
                    Projectiles projectile = new Projectiles((int) ship01.getcharacter().getTranslateX(), (int) ship01.getcharacter().getTranslateY());
                    projectile.getcharacter().setRotate(ship01.getcharacter().getRotate());
                    projectilesList.add(projectile);
                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));

                    asteroidPane.getChildren().add(projectile.getcharacter());
                }

                projectilesList.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if (asteroid.collide(projectile)) {
                            asteroidPane.getChildren().remove(asteroid.getcharacter());
                            asteroid.setAlive(false);
                            projectile.setAlive(false);
                            points.addAndGet(20); // Increment points when collision happens
                        }
                    });
                });

                projectilesList.removeIf(projectile -> {
                    if (!projectile.isAlive()) {
                        asteroidPane.getChildren().remove(projectile.getcharacter());
                        return true;
                    }
                    return false;
                });

                asteroids.removeIf(asteroid -> !asteroid.isAlive());

                text.setText("Points: " + points.get());

                ship01.move();
                projectilesList.forEach(Projectiles::move);
                asteroids.forEach(Asteroid::move);
                asteroids.forEach(asteroid -> {
                    if (ship01.collide(asteroid)) {
                        stop();
                    }
                });
                if (Math.random() < 0.005) {
                    Asteroid asteroid = new Asteroid(width, height);
                    if (!asteroid.collide(ship01)) {
                        asteroids.add(asteroid);
                        asteroidPane.getChildren().add(asteroid.getcharacter());
                    }
                }

            }

        }.start();

        stage.setTitle("Asteroids!");
        stage.setScene(asteroidsScene);
        stage.show();
    }
}
