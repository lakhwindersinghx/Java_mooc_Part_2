import java.util.ArrayList;

public class Box implements Packable {
    private int maxWeight;
    private ArrayList<Packable> box;
    private double sumWeight;

    public Box(int maxWeight) {
        this.box=new ArrayList<>();
        this.maxWeight = maxWeight;
        this.sumWeight=0;

    }

    public void add(Packable items) {
        if (sumWeight < maxWeight) {
            this.box.add(items);
            sumWeight+=items.weight();
        }
    }
    public String toString(){
        return "Box: "+this.box.size()+" items, "+"Total Weight: "+this.sumWeight;
    }



    @Override
    public double weight() {
        double weight = 0;
        for(Packable packable:this.box){
            weight+=packable.weight();
        }
        return weight;
    }
}
