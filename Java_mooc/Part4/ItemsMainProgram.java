import java.util.ArrayList;
import java.util.Scanner;
public class ItemsMainProgram {
    public static void main(String[] args) {
        ArrayList<Items> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String entry = scanner.nextLine();
            if (entry.isEmpty()) {
                break;
            }
            items.add(new Items(entry));
            }
      for(Items item:items){
          System.out.println(item.toString());
      }
        }
    }

