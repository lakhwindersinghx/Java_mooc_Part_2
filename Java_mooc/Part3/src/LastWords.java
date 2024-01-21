import java.util.Scanner;
public class LastWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a string or press enter to exit!");
            String entry = scanner.nextLine();
            if (entry.isEmpty()) {
                break;
            }
            String[] splitString = entry.split(" ");
            String LastWord=splitString[splitString.length-1];
            System.out.println(LastWord);

        }
    }
}

