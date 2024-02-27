import java.util.ArrayList;
import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Publication Year: ");
            int publicationYear= scanner.nextInt();
            scanner.nextLine();

            Books Book=new Books(name,publicationYear);
           if(books.contains(Book)){
               System.out.println("Book already exist on the lisit!");
           }
            books.add(Book);
        }

        }

    }

