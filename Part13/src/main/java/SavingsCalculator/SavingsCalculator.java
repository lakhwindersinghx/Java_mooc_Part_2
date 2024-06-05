package SavingsCalculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculator extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layoutMain = new BorderPane();

        // Middle (LineChart)
        NumberAxis xAxis = new NumberAxis(0, 30, 2);
        xAxis.setLabel("Years");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Amount");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Over Time");

        // VBox component
        VBox vbox = new VBox();
        BorderPane vboxBorderPane1 = new BorderPane(); // Top, monthly savings slider
        BorderPane vboxBorderPane2 = new BorderPane(); // Bottom, interest rate slider

        Slider monthlySavings = new Slider(25.0, 250.0, 25.0);
        monthlySavings.setShowTickLabels(true);
        monthlySavings.setShowTickMarks(true);
        monthlySavings.setMajorTickUnit(25);
        Label savingsLabel = new Label("Monthly Savings: $25.0");
        vboxBorderPane1.setTop(savingsLabel);
        vboxBorderPane1.setBottom(monthlySavings);

        Slider interestRates = new Slider(0, 10, 1);
        interestRates.setShowTickLabels(true);
        interestRates.setShowTickMarks(true);
        interestRates.setMajorTickUnit(1);
        Label interestLabel = new Label("Interest Rate: 1%");
        vboxBorderPane2.setTop(interestLabel);
        vboxBorderPane2.setBottom(interestRates);

        vbox.getChildren().addAll(vboxBorderPane1, vboxBorderPane2);

        // Layout settings
        layoutMain.setTop(vbox);
        layoutMain.setCenter(lineChart);
        Scene calculator = new Scene(layoutMain, 800, 600);
        stage.setScene(calculator);
        stage.setTitle("Savings Calculator");
        stage.show();

        // Add listeners to sliders to update labels and chart (not implemented here)
        monthlySavings.valueProperty().addListener((obs, oldVal, newVal) -> {
            savingsLabel.setText(String.format("Monthly Savings: $%.2f", newVal.doubleValue()));
            // Update the line chart accordingly
        });

        interestRates.valueProperty().addListener((obs, oldVal, newVal) -> {
            interestLabel.setText(String.format("Interest Rate: %.2f%%", newVal.doubleValue()));
            // Update the line chart accordingly
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
