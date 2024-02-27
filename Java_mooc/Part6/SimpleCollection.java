import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        if (elements.isEmpty()) {
            return ("The collection alphabet is empty");
        }
        String printOutput = "The collection alphabet has " + elements.size() + " element:";
        String itemsOnList = " ";
        for (String item : elements) {
            itemsOnList = itemsOnList + "\n" + item;
        }
        return printOutput + "\n" + itemsOnList;
    }
}

