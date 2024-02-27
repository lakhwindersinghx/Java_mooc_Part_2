import java.util.ArrayList;

public class GiftPackage {
    private ArrayList<Gift> list;
    private int weight;

    public GiftPackage(){
        this.list=new ArrayList<>();
    }
    public void addGift(Gift gift){
        list.add(gift);
    }
    public int totalWeight(){
        int totalWeight=0;
        for(Gift item:list){
            totalWeight=totalWeight+item.getWeight();
        }
        return totalWeight;
    }
}

