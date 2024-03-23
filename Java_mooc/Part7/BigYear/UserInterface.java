import java.util.Scanner;

public class UserInterface {
    private final BigYear first;
    private final Scanner scanner;

    public UserInterface(Scanner scanner, BigYear first) {
        this.scanner = new Scanner(System.in);
        this.first = new BigYear();
    }

    public void start() {
        while (true) {
            System.out.println("""
                    Choose:
                    add - adds a bird 
                    observation - adds an observation
                    all - prints all birds
                    one - prints one bird
                    quit - ends the program""");
            String command = scanner.nextLine();
            if(command.equals("quit")){
                break;
            }
            if(command.equals("add")){
                System.out.print("Name: ");
                String name=scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName=scanner.nextLine();
                this.first.addBird(new Birds(name,latinName));
            }
            if(command.equals("all")){
                this.first.getBirdList();
            }
            if(command.equals("one")){
                this.first.getOneBird();
            }
            if(command.equals("observation")){
                System.out.print("Bird: ");
                String birdEntry=scanner.nextLine();
                this.first.observationSearch(birdEntry);

            }

        }
    }

}
