import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return this.storage.getOrDefault(storageUnit,new ArrayList());
    }
    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) {
            this.storage.remove(storageUnit, item);
        }

    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> storageunits=new ArrayList<>();
        for(String item:this.storage.keySet()){
            storageunits.add(item);
        }
        return storageunits;
    }
}

