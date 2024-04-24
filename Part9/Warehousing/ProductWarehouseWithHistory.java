public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity,double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history=new ChangeHistory();
        this.history.add(initialBalance);


    }
    public String history(){
       return this.history.toString();
    }

    public void addToWarehouse(double amount){
        this.history.add(getBalance()+amount);
        super.addToWarehouse(amount);
    }
    public double takeFromWarehouse(double amount){
        this.history.add(getBalance()-amount);
        return super.takeFromWarehouse(amount);
    }
    public void printAnalysis(){
        System.out.println("Product:" + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }

}
