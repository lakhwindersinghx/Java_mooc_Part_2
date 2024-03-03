import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager joke;

    public UserInterface(Scanner scanner, JokeManager joke) {
        this.scanner = scanner;
        this.joke = joke;
    }

    public void start() {
        while (true) {
            System.out.println("""
                    Choose one of the following:
                    x- exit
                    1-adding
                    2-drawing
                    3-printing""");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("add a joke: ");
                String jokeadd= scanner.nextLine();
                joke.addJoke(jokeadd);
            } else if (command.equals("2")) {
                System.out.println(joke.drawJokes());
            } else if (command.equals("3")) {
                joke.printJokes();
            }
        }


    }
}

