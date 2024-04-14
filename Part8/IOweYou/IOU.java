import java.util.HashMap;

public class IOU {
    HashMap<String,Double> account;
    public IOU(){
        this.account=new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        Double settlement=this.account.getOrDefault(toWhom,0.0);
        this.account.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return this.account.get(toWhom);
    }

}
