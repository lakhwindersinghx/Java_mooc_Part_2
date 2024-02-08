import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("Part4/" + file))) {
            while (scanner.hasNext()) {
                String row=scanner.nextLine();
                String[] splits=row.split(",");
                String name=splits[1];
                int age=Integer.parseInt(splits[1]);
                persons.add(new Person(name,age));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return persons;
    }
}