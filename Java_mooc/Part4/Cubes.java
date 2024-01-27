import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number or type end to exit!");
        while (true) {
            String entry = scanner.nextLine();
            if (entry.equals("end")) {
                break;
            }
            int number = Integer.parseInt(entry);
            int cube = number * number * number;
            System.out.println(cube);
        }
    }
}

