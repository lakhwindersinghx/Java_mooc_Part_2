module com.example.part13 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.part13 to javafx.fxml;
    exports com.example.part13;
    exports ButtonAndLabel to javafx.graphics;
    exports TextStatistics to javafx.graphics;
    exports Notifier to javafx.graphics;
    exports UserTitle  to javafx.graphics;
    exports MultipleViews to javafx.graphics;
    exports Greeter to javafx.graphics;
    exports VocabularyTraining to javafx.graphics;
    exports TicTacToe to javafx.graphics;
    exports Shanghai to javafx.graphics;
    exports SavingsCalculator to javafx.graphics;
}