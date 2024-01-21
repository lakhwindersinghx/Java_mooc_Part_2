import java.util.Scanner;
import java.util.ArrayList;

class onTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> entries = new ArrayList<>();
        while (true) {
            System.out.println("Add in the list or Press enter to exit");
            String entry = (scanner.nextLine());
            if (entry.isEmpty()) {
                break;
            }
            entries.add(entry);
        }
        System.out.println("Search in the list:");
        String search= scanner.nextLine();
        boolean check=(entries.contains(search));
        if (check){
            System.out.println(search+" is in the list!");
        }else {
            System.out.println(search+" was not found in the list!");
        }
        }
}
