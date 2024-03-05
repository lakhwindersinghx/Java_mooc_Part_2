import java.util.Scanner;

public class LiquidContainersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String action = scanner.nextLine();
            String[] split = action.split(" ");
            String command = split[0];
            int amount = (Integer.parseInt(split[1]));
            if (action.contains("quit")) {
                break;
            }
            if (command.equals("add")) {
                firstContainer += amount;
                if (firstContainer > 100) {
                    firstContainer = 100;
                }

            }
            if (command.equals("move")) {
                secondContainer += amount;
                firstContainer -= amount;
                if (firstContainer < 0) {
                    firstContainer = 0;
                }
                if(secondContainer>100){
                    secondContainer=100;
                }
            }
            if (command.equals("remove")) {
                secondContainer -= amount;
                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }

        }
    }

}
