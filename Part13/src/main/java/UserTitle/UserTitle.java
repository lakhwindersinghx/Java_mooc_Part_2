package UserTitle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class UserTitle extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scanner entry=new Scanner(System.in);
        System.out.println("Enter title: ");
        String title=entry.nextLine();
        //INTERFACE PARAMETERS
        BorderPane layout = new BorderPane();
        layout.setPrefWidth(400); // Set preferred width
        layout.setPrefHeight(300); // Set preferred height

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }

}
