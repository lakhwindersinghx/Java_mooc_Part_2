import java.util.ArrayList;
import java.util.Scanner;

public class BookMainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookDetails = new ArrayList<>();
        while (true) {
            System.out.print("Enter book name: ");
            String nameEntry = scanner.nextLine();
            if (nameEntry.isEmpty()) {
                break;
            }
            System.out.print("Enter number of pages: ");
            int pageEntry = scanner.nextInt();
            System.out.print("Enter book year: ");
            int yearEntry = scanner.nextInt();
            bookDetails.add(new Book(nameEntry, pageEntry, yearEntry));
            //to consume newline buffer
            scanner.nextLine();
        }
        System.out.println("What information would you like to view? everything? pages? or year? ");
        String choice = scanner.nextLine();

        for (Book item : bookDetails) {
            if (choice.equals("everything")) {
                System.out.println(item);
            } else if (choice.equals("pages")) {
                System.out.println(item.getPages());
            } else if (choice.equals("year")) {
                System.out.println(item.getYear());
            }

        }

    }
        }

