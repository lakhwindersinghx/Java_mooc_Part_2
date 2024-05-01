import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter file path.");
        String fileToRead = scanner.nextLine();
        List<Person> data = getData(fileToRead);
        data.stream() //unsorted
                .forEach(row -> System.out.println(row));
        data.stream().sorted() //sorted using streams
                .forEach(row -> System.out.println(row));
        Collections.sort(data); //collection sorting
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        data.stream()
                .forEach(row -> System.out.println(row));
    }

    public static List<Person> getData(String fileToRead) {
        List<Person> dataFromFile = new ArrayList<>();
        try {
            Files.lines(Paths.get(fileToRead))
                    .map(row -> row.split(","))
                    .filter(elements -> elements.length >= 6)
                    .map(elements -> new Person(elements[3], sanitizeGender(elements[2]), Double.valueOf(elements[5])))
                    .forEach(row -> dataFromFile.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return dataFromFile;
    }

    public static String sanitizeGender(String gen) {
        if (gen.contains("female")) {
            return "female";
        }
        return "male";
    }

}
