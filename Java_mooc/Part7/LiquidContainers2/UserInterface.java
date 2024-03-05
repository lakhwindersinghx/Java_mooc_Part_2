import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container firstContainer;
    private Container secondContainer;

    public UserInterface(Scanner scanner, Container firstContainer, Container secondContainer) {
        this.scanner = scanner;
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
    }

    public void start() {
        while (true) {
            String command = scanner.nextLine();
            String[] splits = command.split(" ");
            String action = splits[0];
            int amount = Integer.parseInt(splits[1]);
            if (command.contains("x")) {
                break;
            } else if (command.contains("add")) {
                firstContainer.add(amount);
            } else if (command.contains("remove")) {
                secondContainer.remove(amount);
            } else if (command.contains("move")) {
                firstContainer.move(amount,secondContainer);
            } else if (command.contains("contains")) {
                System.out.println(firstContainer.contains()
                        + "\n"+
                secondContainer.contains());
            }
        }
    }
}
