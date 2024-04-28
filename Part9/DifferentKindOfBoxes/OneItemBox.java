import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> items;
    public OneItemBox(){
        this.items=new ArrayList<>();

    }

    @Override
    public void add(Item item) {
        if (this.items.isEmpty()) {
            this.items.add(item);
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
