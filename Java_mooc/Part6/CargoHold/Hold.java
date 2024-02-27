import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcaseList;
    private final int maxWeight;

    public Hold(int maxWeight) {
        this.suitcaseList=new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= this.maxWeight) {
            suitcaseList.add(suitcase);
        }
    }
    public int totalWeight(){
        int totalWeight=0;
        for(Suitcase item:suitcaseList){
            totalWeight+=item.totalWeight();
        }
        return totalWeight;
    }
    public String toString() {
        return suitcaseList.size() +" suitcases (" + totalWeight() + "KG)";
    }
}
