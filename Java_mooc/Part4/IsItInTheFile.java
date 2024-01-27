import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        ArrayList<String> fileContent = new ArrayList<>();
        Scanner entry = new Scanner(System.in);

        System.out.println("WHICH FILE WOULD YOU LIKE TO ACCESS? ");
        String fileName = entry.nextLine();
        try (Scanner scanner = new Scanner(Paths.get("Part4/" + fileName))) {
            while (scanner.hasNext()) {
                String row = scanner.nextLine();
                System.out.println(row);
                fileContent.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file "+ fileName +" failed.");
            System.exit(1);
        }
        System.out.println("What are you looking for in " + fileName);
        String itemName = entry.nextLine();

        if (fileContent.contains(itemName)) {
            System.out.println("FOUND: " + itemName);
        } else {
            System.out.println(itemName + " not found in " + fileName);
        }
    }
}

