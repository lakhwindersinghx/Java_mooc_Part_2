public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


    public int hashCode() {
        int result = 7;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.weight;
        return result;
    }

    public boolean equals(Object compared) {
        //check if same location
        if (this == compared) {
            return true;
        }
        //if same instance
        if (!(compared instanceof Item)) {
            return false;
        }
        //object conversion
        Item comparedItem = (Item) compared;
        //if objects are equal, instances must be equal too
        if (this.name.equals(comparedItem.name) && this.weight == comparedItem.weight) {
            return true;
        }
        return false;

    }
}
