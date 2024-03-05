public class LiquidContainers{
    private String name;
    private double litres;
    private final int upperbound;

    public LiquidContainers(String name){
        this.name=name;
        this.upperbound=100;
    }

    public  void addAmount(double amount){
        this.litres+=amount;
        if(this.litres>upperbound){
            this.litres=upperbound;
        }
    }
    public void moveAmount(double amount){
        //moving from litres to second
        this.litres-=amount;

    }
    public void removeAmount(double amount){
        //remove from second.

    }
    public double getlitres(){
        return this.litres;
    }


}