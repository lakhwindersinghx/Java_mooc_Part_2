package Smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Smiley extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        // Draw the face (circle)
        painter.setFill(Color.YELLOW);
        painter.fillOval(150, 100, 300, 300);

        // Draw the eyes (circles)
        painter.setFill(Color.BLACK);
        painter.fillOval(200, 200, 50, 50); // Left eye
        painter.fillOval(350, 200, 50, 50); // Right eye

        //Draw the eybrows
        painter.setStroke(Color.BLACK);
        painter.setLineWidth(2);
        painter.strokeLine(210, 150, 310, 200);


        // Draw the mouth (arc)
        painter.setStroke(Color.BLACK);
        painter.setLineWidth(8);
        painter.strokeArc(200, 250, 200, 100, 180, 180, javafx.scene.shape.ArcType.OPEN); // Smile

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);

        Scene view = new Scene(paintingLayout);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
