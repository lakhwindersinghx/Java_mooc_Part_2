import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> lplate;

    public VehicleRegistry() {
        this.lplate = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!lplate.containsKey(licensePlate)) {
            lplate.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        if(!(lplate.keySet().contains(licensePlate))) {
            return null;
        }
        return lplate.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if(!(lplate.keySet().contains(licensePlate))){
            return false;
        }
        lplate.remove(licensePlate);
        return true;
    }
    public void printLicensePlates(){

        for (LicensePlate keys : lplate.keySet()) {
            System.out.println(keys);
            // Process key and value
        }
    }
    public void printOwners(){
        for(String owners:lplate.values()){
            System.out.println(owners);
        }
    }
}
