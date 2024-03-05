import java.util.Scanner;

public class ContainerMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        UserInterface ui = new UserInterface(scanner,firstContainer,secondContainer);
        ui.start();
    }
}
