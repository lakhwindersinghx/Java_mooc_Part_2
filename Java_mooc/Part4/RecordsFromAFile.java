import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("WHICH FILE WOULD YOU LIKE TO ACCESS? ");
        String fileName = entry.nextLine();

        try (Scanner scanner = new Scanner(Paths.get("Part4/" + fileName))) {
            while (scanner.hasNext()) {

                String row = scanner.nextLine();
                String[] fileSplit=row.split(",");
                String name=fileSplit[0];
                int age=Integer.parseInt(fileSplit[1]);
                System.out.println(name+","+"age: "+age+" years");
            }


        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
            System.exit(1); // Terminate the program with a non-zero exit code
        }
    }
}
