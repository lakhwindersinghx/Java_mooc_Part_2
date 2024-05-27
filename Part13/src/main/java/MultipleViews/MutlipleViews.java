package MultipleViews;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MutlipleViews extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button toSecond = new Button("To the Second View!");
        Button toThird = new Button("To the third View!");
        Button toFirst = new Button("To the first View");

        // First view
        BorderPane firstView = new BorderPane();
        firstView.setCenter(new Text("First View"));
        firstView.setBottom(toSecond);

        Scene firstScene = new Scene(firstView);

        // Second view
        VBox secondView = new VBox();
        secondView.getChildren().addAll(new Text("Second View"), toThird);

        Scene secondScene = new Scene(secondView);

        // Third view
        GridPane thirdView = new GridPane();
        thirdView.add(new Text("Third View"), 0, 0);
        thirdView.add(toFirst, 1, 1);

        Scene thirdScene = new Scene(thirdView);

        // Button Function, //setTitles when creating buttons as following;
        toSecond.setOnAction((event) -> {
            stage.setScene(secondScene);
            stage.setTitle("Second VIEW");
        });
        toThird.setOnAction((event) -> {
            stage.setScene(thirdScene);
            stage.setTitle("Third VIEW");
        });
        toFirst.setOnAction((event) -> {
            stage.setScene(firstScene);
            stage.setTitle("First VIEW");
        });

        // Initial stage setup
        stage.setScene(firstScene);
        stage.setTitle("First VIEW");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
