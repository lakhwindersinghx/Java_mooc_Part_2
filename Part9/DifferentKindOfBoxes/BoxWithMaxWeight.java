import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private int sum;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
        this.sum = 0;
    }

    @Override
    public void add(Item item) {
        {
            if (sum < capacity) {
                items.add(item);
                sum += item.getWeight();
            }
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item currentItem : items) {
            if (currentItem.equals(item)) {
                return true; // Item found in the box
            }
        }
        return false; // Item not found in the box
    }
}
