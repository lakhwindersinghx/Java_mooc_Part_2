import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int counter = 0;

        System.out.println("WHICH FILE WOULD YOU LIKE TO ACCESS? ");
        String fileName = entry.nextLine();

        try (Scanner scanner = new Scanner(Paths.get("Part4/" + fileName))) {
            while (scanner.hasNext()) {
                int row = scanner.nextInt();
                System.out.println(row);
                numberList.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
            System.exit(1); // Terminate the program with a non-zero exit code
        }

        System.out.println("Upper bound? ");
        int upper = entry.nextInt();
        System.out.println("Lower bound? ");
        int lower = entry.nextInt();

        for (int item : numberList) {
            if (item >= lower && item <= upper) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
