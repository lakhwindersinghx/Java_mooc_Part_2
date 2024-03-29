import java.util.ArrayList;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");


    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String item : hashmap.keySet()) {
            System.out.println(item);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String item : hashmap.keySet()) {
            if (item.contains(text)) {
                System.out.println(item);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String item : hashmap.keySet()) {
            if (item.contains(text)) {
                System.out.println(hashmap.get(item));
            }
        }
    }
}


