package logic;


import ui.UserInterface;
import ui.TextInterface;

public class AppMain {

    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}