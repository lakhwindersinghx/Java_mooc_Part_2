package Notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Arrays;

public class Notifier extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();
        layout.setPrefWidth(400); // Set preferred width
        layout.setPrefHeight(300); // Set preferred height


        TextField text = new TextField();
        Button buttons = new Button("Update");
        Label label = new Label();

        layout.setTop(text);
        layout.setLeft(buttons);
        layout.setBottom(label);

        buttons.setOnAction((event) -> {
            updateLabel(text.getText(), label);
        });

        text.textProperty().addListener((observable, oldValue, newValue) -> {
            updateLabel(newValue, label);
        });

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.setTitle("Notifier Application");
        stage.show();
    }

    private void updateLabel(String text, Label label) {
        // Update label with character count
        int characters = text.length();
        // Update label with word count
        String[] parts = text.split("\\s+"); // Split by whitespace
        int words = parts.length;
        // Find the longest word
        String longest = Arrays.stream(parts)
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse("");

        label.setText("Characters: " + characters + " | Words: " + words + " | Longest Word: " + longest);
    }
}
