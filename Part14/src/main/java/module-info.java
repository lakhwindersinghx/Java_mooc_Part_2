module com.button.part14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.button.part14 to javafx.fxml;
    exports com.button.part14;
    exports CanvasPaint to javafx.graphics;
    exports Smiley to javafx.graphics;
    exports Asteroids to javafx.graphics;
}