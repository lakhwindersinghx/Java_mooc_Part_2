import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private final int weight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.weight = maxWeight;

    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item x : items) {
            totalWeight += x.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() < this.weight) {
            items.add(item);
        }
    }
    public String printItems(){
        System.out.println("Suitcase contains the following items:");
        System.out.println();
        String suitcaseItems="";
        for(Item x:items){
            suitcaseItems+=x.getName()+" "+x.getWeight()+"\n";
        }
        return suitcaseItems;
    }
    public Item heaviestItem(){
        Item heaviest=items.get(0);
        for(Item x:items){
            if(heaviest.getWeight()<x.getWeight()){
                heaviest=x;
            }
        }
        return heaviest;
    }

    public String toString() {
        boolean firstItem = false;
        if (items.isEmpty()) {
            return ("No items");
        }
        String output = "";
//        int counter = 0;
        for (Item x : items) {
//            counter++;
            if (items.size() == 1) {
                output += "1 item " + totalWeight() + "KG" + "\n";
            } else {
                output += items.size()+ " items " + totalWeight() + "KG" + "\n";
            }
        }
        return output;
    }
}