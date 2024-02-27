import java.util.ArrayList;
import java.util.Scanner;

public class ArchiveMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier (empty will stop):");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name (empty will stop:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive article = new Archive(identifier, name);
            items.add(article);
        }
        ArrayList<Archive> uniqueItems = new ArrayList<>();
        System.out.println("====Items====");
        for (Archive x : items) {
            if (!(uniqueItems.contains(x))) {
                uniqueItems.add(x);
            }
        }
        for (Archive item : uniqueItems) {
            System.out.println(item);
        }


    }
}
