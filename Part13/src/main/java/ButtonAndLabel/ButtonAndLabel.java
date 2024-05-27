package ButtonAndLabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabel extends Application {

    @Override
    public void start(Stage window) {
        // First scene with FlowPane
        Button button = new Button("This is a button");
        Label label = new Label("This is a label");
        TextField textField = new TextField();
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().addAll(button, label, textField);

        Scene scene = new Scene(componentGroup);

        // Second scene with BorderPane
        BorderPane layout = new BorderPane();
        layout.setTop(new Label("Top"));
        layout.setRight(new Label("Right"));
        layout.setBottom(new Label("Bottom"));
        layout.setLeft(new Label("Left"));
        layout.setCenter(new Label("Center"));

        Scene scene1 = new Scene(layout);

        // Set up button to switch scenes
        button.setOnAction(e -> window.setScene(scene1));

        // Set initial scene
        window.setScene(scene);
        window.setTitle("Button and Label Application");
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
