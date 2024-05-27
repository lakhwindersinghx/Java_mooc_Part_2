package TextStatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class TextStatistics extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane base=new BorderPane();

        HBox buttons=new HBox(); //HBox-class enables UI components to be laid out in a single horizontal row.
        buttons.setSpacing(10);
        buttons.getChildren().add(new Button("First"));
        buttons.getChildren().add(new Button("Second"));
        buttons.getChildren().add(new Button("Third"));

        VBox text=new VBox(); //vertical laid out
        text.setSpacing(10);
        text.getChildren().add(new Button("First"));
        text.getChildren().add(new Button("Second"));
        text.getChildren().add(new Button("Third"));

        base.setTop(buttons);
        base.setLeft(text);
        base.setCenter(new TextArea(""));

        Scene finalApp=new Scene(base);

        stage.setScene(finalApp);
        stage.show();






    }
}
