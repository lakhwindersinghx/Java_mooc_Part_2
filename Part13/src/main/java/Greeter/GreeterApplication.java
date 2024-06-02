package Greeter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Creating opener scene:
        Label greeting = new Label("Enter your name and start.");
        TextField nameText = new TextField();
        Button start = new Button("Start");

        GridPane loginPage = new GridPane();
        loginPage.add(greeting, 0, 0);
        loginPage.add(nameText, 0, 1);
        loginPage.add(start, 0, 2);

        Scene openerScene = new Scene(loginPage);

        // Creating second scene:
        StackPane welcomeWindow = new StackPane();
        Label opener = new Label();
        welcomeWindow.getChildren().add(opener);

        Scene welcomeScene = new Scene(welcomeWindow);

        start.setOnAction((event) -> {
            String name = nameText.getText().trim();
            if (!name.isEmpty()) {
                opener.setText("Welcome, " + name + "!");
                stage.setScene(welcomeScene);
            }
        });

        stage.setScene(openerScene);
        stage.show();
    }
}
