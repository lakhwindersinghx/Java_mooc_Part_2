import java.nio.file.Paths;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        try (Scanner scanner = new Scanner(Paths.get("Part4/guestlist.txt"))) {
            while (scanner.hasNext()) {
                System.out.println("Enter names, an empty line quits.");
                String entryName = entry.nextLine();
                if (entryName.isEmpty())
                    break;
                ////////////////////////////////
                String row = scanner.nextLine();
                if (row.contains(entryName)) {
                    System.out.println(entryName + " is in the list!");
                } else {
                    System.out.println("not found!");
                }
            }
            }catch(Exception e){
                System.out.println("Error: " + e);
            }
        System.out.println("Thank you!!!");
        }
    }
