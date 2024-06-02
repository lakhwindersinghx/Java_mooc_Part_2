package TicTacToe;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GUI extends Application {
    private static boolean xTurn = true;
    private Button[][] buttons = new Button[3][3];


    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

        //Displaying Player turn
        Label heading = new Label("TURN: ");
        layout.setTop(heading);

        //adding buttons now
        GridPane buttonGrid = new GridPane();


        for (int i = 0; i < 3; i++) { //row
            for (int j = 0; j < 3; j++) { //column
                Button btn = new Button(" ");
                btn.setFont(Font.font("Monospaced", 40));
                buttons[i][j] = btn;

                //onclick Function
                btn.setOnAction(event -> {
                    if (!btn.getText().equals(" ")) {
                        return; // Ignore click if the button is already marked
                    }
                    if (xTurn) {
                        btn.setText("X");
                        heading.setText("TURN: O");
                    } else {
                        btn.setText("O");
                        heading.setText("TURN: X");
                    }
                    xTurn = !xTurn;
                    checkWin(heading);

                });
                buttonGrid.add(btn, j, i);
            }
        }
        layout.setBottom(buttonGrid);

        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }

    public static String getPlayer() {
        if (xTurn) {
            return "X";
        } else {
            return "O";
        }
    }

    public void checkWin(Label heading) {
        //for rows
        for (int i = 0; i < 3; i++) {
            if (!buttons[i][0].getText().equals(" ") &&
                buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                buttons[i][0].getText().equals(buttons[i][2].getText())) {
                heading.setText("WINNER: " + buttons[i][0].getText());
                disableButtons();
                return;
            }
        }
        //for columns
        for (int i = 0; i < 3; i++) {
            if (!buttons[0][i].getText().equals(" ") &&
                buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                buttons[0][i].getText().equals(buttons[2][i].getText())) {
                heading.setText("WINNER: " + buttons[i][0].getText());
                disableButtons();
                return;
            }
        }
        //for diagonals
        if (!buttons[0][0].getText().equals(" ") &&
            buttons[0][0].getText().equals(buttons[1][1].getText()) &&
            buttons[0][0].getText().equals(buttons[2][2].getText())) {
            heading.setText("WINNER: " + buttons[0][0].getText());
            disableButtons();
            return;
        }

        // Check anti-diagonal
        if (!buttons[0][2].getText().equals(" ") &&
            buttons[0][2].getText().equals(buttons[1][1].getText()) &&
            buttons[0][2].getText().equals(buttons[2][0].getText())) {
            heading.setText("WINNER: " + buttons[0][2].getText());
            disableButtons();
        }
    }

    public void disableButtons() {
        for (int row = 0; row < 3; row++) { //row
            for (int column = 0; column < 3; column++) {
                buttons[row][column].setDisable(true);
            }
        }
    }


    public static void main(String[] args) {
        launch();
    }
}
