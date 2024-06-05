package Shanghai;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shanghai extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Reading the file
        Map<Integer, Integer> rankingData = new HashMap<>();
        try {
            Scanner fileReader = new Scanner("Shanghai/data.txt");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(" ");   // split the line based on the ':' character
                rankingData.put(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
                System.out.println("Year: " + Integer.parseInt(parts[0]) + ", Ranking: " + Integer.parseInt(parts[1]));
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        //layout for linegraph
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Ranking");
        yAxis.setLabel("Year");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helinski,Shanghai Ranking");

        XYChart.Series shanghaiRanking = new XYChart.Series();
        shanghaiRanking.setName("Shanghai Ranking");

        rankingData.forEach((year, ranking) -> {
            shanghaiRanking.getData().add(new XYChart.Data<>(year, ranking));
        });

        lineChart.getData().add(shanghaiRanking);

        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Shanghai Ranking");
        stage.show();

        }
    }

