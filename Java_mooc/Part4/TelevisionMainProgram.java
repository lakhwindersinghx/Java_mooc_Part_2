import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionMainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Television> movies = new ArrayList<>();
        int entryDuration = 0;
        while (true) {
            System.out.print("Enter movie name or press enter to exit:");
            String entryName = scanner.nextLine();
            if (entryName.isEmpty())
                break;
            System.out.print("Enter movie duration:");
            entryDuration = scanner.nextInt();

            scanner.nextLine();

            Television movieDetails = new Television(entryName, entryDuration);
            movies.add(movieDetails);
        }
        System.out.println("What's the maximum duration you wanna set?");
        int maxDuration = scanner.nextInt();
            for (Television item : movies) {
                if (item.getDuration()<=maxDuration){
                System.out.println(item);
            }
        }
    }
}
