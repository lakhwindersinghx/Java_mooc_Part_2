import java.util.Scanner;

public class JokerManagerMain {
    public static void main(String[] args) {


        JokeManager manager = new JokeManager();
        manager.addJoke("Just joking 1");
        manager.addJoke("Just joking 2");
        manager.addJoke("Just joking 3");
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(scanner, manager);
        ui.start();
    }
}