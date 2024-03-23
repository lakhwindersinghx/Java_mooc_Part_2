import java.util.Scanner;

public class BigYearMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigYear birds=new BigYear();
        UserInterface ui=new UserInterface(scanner,birds);
        ui.start();
    }
}
